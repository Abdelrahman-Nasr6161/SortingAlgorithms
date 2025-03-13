package sorting.models.Sorts;

import java.util.ArrayList;
import java.util.Random;

public class QuickSort implements Sort {
    private ArrayList<int[]> intermediateArrays = new ArrayList<>();

    public String getName() {
        return "Quick Sort";
    }

    public ArrayList<int[]> sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return intermediateArrays;
    }

    public void quickSort(int[] arr, int lowIndex, int highIndex) {
        if (highIndex <= lowIndex) {
            return;
        }

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = arr[pivotIndex];

        swap(arr, pivotIndex, highIndex);

        int leftPointer = lowIndex;
        int rightPointer = highIndex - 1;

        while (leftPointer < rightPointer) {
            while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(arr, leftPointer, rightPointer);
        }

        if (arr[leftPointer] > arr[highIndex]) {
            swap(arr, leftPointer, highIndex);
        } else {
            leftPointer = highIndex;
        }

        intermediateArrays.add(arr.clone());

        quickSort(arr, lowIndex, leftPointer - 1);
        quickSort(arr, leftPointer + 1, highIndex);
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
