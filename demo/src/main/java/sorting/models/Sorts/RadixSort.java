package sorting.models.Sorts;

import java.util.ArrayList;

public class RadixSort implements Sort {

    private ArrayList<int[]> intermediateArrays = new ArrayList<>();

    // Get the maximum absolute value for proper scaling
    private int getMax(int[] arr, int n) {
        int max = Math.abs(arr[0]);
        for (int i = 1; i < n; i++) {
            if (Math.abs(arr[i]) > max) {
                max = Math.abs(arr[i]);
            }
        }
        return max;
    }

    // Modified countSort to handle negative numbers
    private void countSort(int[] arr, int n, int exp) {
        int[] output = new int[n];
        int[] count = new int[19]; // 0 to 18 for [-9 to 9] (handles negative digits)

        // Count occurrences (offset by +9 to handle negatives)
        for (int i = 0; i < n; i++) {
            int index = ((arr[i] / exp) % 10) + 9;
            count[index]++;
        }

        // Accumulate counts
        for (int i = 1; i < 19; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            int index = ((arr[i] / exp) % 10) + 9;
            output[count[index] - 1] = arr[i];
            count[index]--;
        }

        // Copy sorted output back to original array
        System.arraycopy(output, 0, arr, 0, n);

        // Store intermediate array state
        intermediateArrays.add(arr.clone());
    }

    @Override
    public ArrayList<int[]> sort(int[] arr) {
        int n = arr.length;
        int max = getMax(arr, n);

        // Run countSort for each digit's place value
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, n, exp);
        }

        return intermediateArrays;
    }

    @Override
    public String getName() {
        return "Radix Sort";
    }
}