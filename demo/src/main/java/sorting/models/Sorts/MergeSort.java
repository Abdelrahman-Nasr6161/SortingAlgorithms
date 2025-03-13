package sorting.models.Sorts;

import java.util.ArrayList;
import java.util.List;

public class MergeSort implements Sort {

    private List<int[]> intermediateArrays = new ArrayList<>();

    @Override
    public ArrayList<int[]> sort(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        mergeSort(arr, low, high);
        return new ArrayList<>(intermediateArrays); // Return intermediate states
    }

    public void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[low + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }

        // Store the current state of the array after merging
        intermediateArrays.add(arr.clone());
    }

    @Override
    public String getName() {
        return "Merge Sort";
    }
}
