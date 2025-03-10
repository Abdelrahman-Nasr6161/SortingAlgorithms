package sorting;

import java.util.Scanner;

import sorting.models.Sorter;
import sorting.models.Sorts.BubbleSort;
import sorting.models.Sorts.InsertionSort;
import sorting.models.Sorts.Sort;


public class Main implements Runnable {
    Sorter sorter;
    public Main(Sort sort) { 
        sorter = new Sorter(sort);
        
    }
    public static void main(String[] args) {
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
        int choice = sc.nextInt();
        Sort sort = null;
        if (choice == 1) {
            sort = new BubbleSort();
        } else if (choice == 2) {
            sort = new InsertionSort();
        }
        Main main = new Main(sort);
        main.run();
    }
    @Override
    public void run() {
        
        
    }
}