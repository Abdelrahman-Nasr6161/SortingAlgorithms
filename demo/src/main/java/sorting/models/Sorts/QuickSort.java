package sorting.models.Sorts;
import java.util.Random;

public class QuickSort implements Sort {
    public String getName() {
        return "Quick Sort";
    }
    public void sort(int[] arr)
    {
        quickSort(arr, 0, arr.length - 1);
    }
    public void quickSort(int[] arr, int lowIndex, int highIndex) {

        // One element array
        if(highIndex <= lowIndex){
            return;
        }

        // Randomly select a pivot
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = arr[pivotIndex];

        // Swap the pivot with the last element
        swap(arr, pivotIndex, highIndex);

        int leftPointer = lowIndex;
        int rightPointer = highIndex - 1;

        // Partition the array
        while(leftPointer < rightPointer){

            while(arr[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while(arr[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

            swap(arr, leftPointer, rightPointer);
        }

        if(arr[leftPointer] > arr[highIndex]){
            swap(arr, leftPointer, highIndex);
        }
        else{
            leftPointer = highIndex;
        }

        // Recursively sort the subarrays
        quickSort(arr, lowIndex, leftPointer - 1);  // Left subarray
        quickSort(arr, leftPointer + 1, highIndex);  // Right subarray
    
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
