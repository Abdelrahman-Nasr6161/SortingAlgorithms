package sorting.models.Sorts;

import java.util.ArrayList;

public class InsertionSort implements Sort {
    private ArrayList<int[]> intermediateArrays = new ArrayList<>();

    public String getName() {
        return "Insertion Sort";
    }

    public ArrayList<int[]> sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            intermediateArrays.add(arr.clone());
        }
        return intermediateArrays;
    }
}