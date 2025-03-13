package sorting.models.Sorts;

import java.util.ArrayList;

public class BubbleSort implements Sort {
    private ArrayList<int[]> intermediateArrays = new ArrayList<>();

    public String getName() {
        return "Bubble Sort";
    }

    public ArrayList<int[]> sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            intermediateArrays.add(arr.clone());
        }
        return intermediateArrays;
    }
}