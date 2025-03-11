package sorting;

import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;

import sorting.models.Sorter;
import sorting.models.Sorts.BubbleSort;
import sorting.models.Sorts.InsertionSort;
import sorting.models.Sorts.MergeSort;
import sorting.models.Sorts.QuickSort;
import sorting.models.Sorts.RadixSort;

public class Main {
    private static Sorter sorter;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of elements in the array");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Enter the elements of the array");
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }
        // Creates an instance of Array_Sort, constructor takes relative path to demo of
        // a file
        // that contains an array of numbers.
        Sort_Array sort_array = null;
        try {        
            sort_array = new Sort_Array("data/array.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        int[] arr = sort_array.array;

        System.out.println("Enter the sorting algorithm to be used");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Insertion Sort");
        System.out.println("3. Quick Sort");
        System.out.println("4. Radix Sort");
        System.out.println("5. Merge Sort");
        int choice = sc.nextInt();
        System.out.println(choice);
        sorter = new Sorter();
        switch (choice) {
            case 1:
                sorter.setSort(new BubbleSort());
                break;
            case 2:
                sorter.setSort(new InsertionSort());
                break;
            case 3:
                sorter.setSort(new QuickSort());
                break;
            case 4:
                sorter.setSort(new RadixSort());
                break;
            case 5:
                sorter.setSort(new MergeSort());
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
                break;
            
        }
        int startTime = (int) System.nanoTime();
        sorter.sort(arr);
        int endTime = (int) System.nanoTime();
        System.out.println("The sorted array is: ");
            System.out.println(Arrays.toString(arr));
            System.out.println("Time taken: " + (endTime - startTime) + " ns");
            sc.close();

    }

}