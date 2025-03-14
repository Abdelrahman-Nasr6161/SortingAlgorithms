package sorting;

import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

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


        // Creates an instance of Array_Sort, constructor takes relative path to "demo" folders of a file
        // that contains an array of numbers.
        Sort_Array sort_array = null;
        System.out.println("Enter the path of the file containing the array, ex: demo/data/array.txt");
        String input = sc.nextLine();

        try {
            if (input.trim().isEmpty()){
                input = "demo/data/array.txt";
            }        
            sort_array = new Sort_Array(input);
        } catch (IOException e) {
            System.out.println("No such file found");
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
        List<int[]> intermediates = sorter.sort(arr);
        int endTime = (int) System.nanoTime();
        System.out.println("Do you want to see the intermediate arrays? ");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int choice2 = sc.nextInt();
        if (choice2 == 1) {
            for (int[] intermediate : intermediates) {
                System.out.println(Arrays.toString(intermediate));
            }
        }
        System.out.println("The sorted array is: ");
            System.out.println(Arrays.toString(arr));
            System.out.println("Time taken: " + (endTime - startTime) + " ns");
            sc.close();

    }

}