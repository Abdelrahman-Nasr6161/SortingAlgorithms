package sorting;

import sorting.models.Sorter;
import sorting.models.Sorts.BubbleSort;
import sorting.models.Sorts.InsertionSort;


public class Main {
    Sorter sorter;
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        Sorter sorter = new Sorter(new BubbleSort());
        int arr2 [] = arr.clone();
        sorter.sort(arr);
        sorter.setSort(new InsertionSort());
        sorter.sort(arr2);
        System.out.println("Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Insertion Sort");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}