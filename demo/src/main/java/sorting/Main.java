package sorting;

import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;

import sorting.models.Sorter;
import sorting.models.Sorts.BubbleSort;
import sorting.models.Sorts.InsertionSort;
import sorting.models.Sorts.Sort;
import sorting.models.Sorts.QuickSort;


public class Main implements Runnable {
    Sorter sorter;
    public Main(Sort sort) { 
        sorter = new Sorter(sort);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of elements in the array");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the elements of the array");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//    	 Creates an instance of Array_Sort, constructor takes relative path to demo of a file
//         that contains an array of numbers.
         Sort_Array sort_array = null;
         try {
             sort_array = new Sort_Array("data/array.txt");
         } catch (IOException e) {
             System.out.println(e.getMessage());
         }
         int[] arr = sort_array.array;
         
        System.out.println("Enter the sorting algorithm to be used");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Insertion Sort");
        System.out.println("3. Quick Sort");
        int choice = sc.nextInt();
        Sort sort = null;
        if (choice == 1) {
            sort = new BubbleSort();
            sort.sort(arr);
        } else if (choice == 2) {
            sort = new InsertionSort();
            sort.sort(arr);
        } else if (choice == 3) {
            sort = new QuickSort();
            sort.sort(arr);
        }
        // else {
        //     System.out.println("Invalid choice");
        //     System.exit(0);
        // }

        System.out.println(""+ Arrays.toString(arr));
        // sc.close();
        Main main = new Main(sort);
        main.run();
    }
    @Override
    public void run() {
        
        
    }
}