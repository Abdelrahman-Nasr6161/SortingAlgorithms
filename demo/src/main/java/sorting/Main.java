package sorting;

import java.util.Scanner;

import sorting.models.Sorter;
import sorting.models.Sorts.BubbleSort;
import sorting.models.Sorts.InsertionSort;
import sorting.models.Sorts.RadixSort;
import sorting.models.Sorts.Sort;


public class Main {
    private static Sorter sorter;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the sorting algorithm to be used");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Insertion Sort");
        System.out.println("3. Radix Sort");
        int choice = sc.nextInt();
        Sort sort = null;
        switch (choice) {
            case 1:
            sort = new BubbleSort();
            break;
            case 2:
            sort = new InsertionSort();
            break;
            case 3:
            sort = new RadixSort();
            break;
            default:
            System.out.println("Invalid choice");
            System.exit(0);
        }
        sorter = new Sorter(sort);
        int startTime = (int) System.nanoTime();
        sorter.sort(arr);
        int endTime = (int) System.nanoTime();
        int elapsedTime = endTime - startTime;
        System.out.println("Time taken: " + elapsedTime + " ns");
        System.out.println("The array after sorting using " + sorter.getName() + " is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}