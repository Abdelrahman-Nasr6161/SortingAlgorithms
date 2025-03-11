import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sorting.models.Sorter;
import sorting.models.Sorts.BubbleSort;
import sorting.models.Sorts.InsertionSort;
import sorting.models.Sorts.MergeSort;
import sorting.models.Sorts.QuickSort;
import sorting.models.Sorts.RadixSort;

public class Tester {
    @Test
    void test_bubbleSort1()
    {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        Sorter sorter = new Sorter(new BubbleSort());
        int arrExpected[] = {11, 12, 22, 25, 34, 64, 90};
        long startTime = System.nanoTime();
        sorter.sort(arr);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Bubble Sort 1 - Time taken: " + elapsedTime + " ns");
        assertArrayEquals(arrExpected, arr);
    }

    @Test
    void test_bubbleSort2()
    {
        int arr[] = {5,4,3,1,6,1,4,2,5,7};
        Sorter sorter = new Sorter(new BubbleSort());
        int arrExpected[] = {1,1,2,3,4,4,5,5,6,7};
        long startTime = System.nanoTime();
        sorter.sort(arr);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Bubble Sort 2 - Time taken: " + elapsedTime + " ns");
        assertArrayEquals(arrExpected, arr);
    }

    @Test
    void test_bubbleSort3()
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Sorter sorter = new Sorter(new BubbleSort());
        int arrExpected[] = {1,2,3,4,5,6,7,8,9,10};
        long startTime = System.nanoTime();
        sorter.sort(arr);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Bubble Sort 3 - Time taken: " + elapsedTime + " ns");
        assertArrayEquals(arrExpected, arr);
    }

    @Test
    void test_bubbleSort4()
    {
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        Sorter sorter = new Sorter(new BubbleSort());
        int arrExpected[] = {1,2,3,4,5,6,7,8,9,10};
        long startTime = System.nanoTime();
        sorter.sort(arr);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Bubble Sort 4 - Time taken: " + elapsedTime + " ns");
        assertArrayEquals(arrExpected, arr);
    }

    @Test
    void test_insertionSort1()
    {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        Sorter sorter = new Sorter(new InsertionSort());
        int arrExpected[] = {11, 12, 22, 25, 34, 64, 90};
        long startTime = System.nanoTime();
        sorter.sort(arr);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Insertion Sort 1 - Time taken: " + elapsedTime + " ns");
        assertArrayEquals(arrExpected, arr);
    }

    @Test
    void test_insertionSort2()
    {
        int arr[] = {5,4,3,1,6,1,4,2,5,7};
        Sorter sorter = new Sorter(new InsertionSort());
        int arrExpected[] = {1,1,2,3,4,4,5,5,6,7};
        long startTime = System.nanoTime();
        sorter.sort(arr);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Insertion Sort 2 - Time taken: " + elapsedTime + " ns");
        assertArrayEquals(arrExpected, arr);
    }

    @Test
    void test_insertionSort3()
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Sorter sorter = new Sorter(new InsertionSort());
        int arrExpected[] = {1,2,3,4,5,6,7,8,9,10};
        long startTime = System.nanoTime();
        sorter.sort(arr);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Insertion Sort 3 - Time taken: " + elapsedTime + " ns");
        assertArrayEquals(arrExpected, arr);
    }

    @Test
    void test_insertionSort4()
    {
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        Sorter sorter = new Sorter(new InsertionSort());
        int arrExpected[] = {1,2,3,4,5,6,7,8,9,10};
        long startTime = System.nanoTime();
        sorter.sort(arr);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Insertion Sort 4 - Time taken: " + elapsedTime + " ns");
        assertArrayEquals(arrExpected, arr);
    }

    @Test
    void test_quickSort1()
    {
        int arr[] = {12,2,6,10,14,1,3,5,7,9};
        Sorter sorter = new Sorter(new QuickSort());
        int arrExpected[] = {1,2,3,5,6,7,9,10,12,14};
        long startTime = System.nanoTime();
        sorter.sort(arr);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Quick Sort 1 - Time taken: " + elapsedTime + " ns");
        assertArrayEquals(arrExpected, arr);
    }

    @Test
    void test_quickSort2()
    {
        int arr[] = {5,4,3,1,6,1,4,2,5,7};
        Sorter sorter = new Sorter(new QuickSort());
        int arrExpected[] = {1,1,2,3,4,4,5,5,6,7};
        long startTime = System.nanoTime();
        sorter.sort(arr);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Quick Sort 2 - Time taken: " + elapsedTime + " ns");
        assertArrayEquals(arrExpected, arr);
    }

    @Test
    void test_quickSort3()
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Sorter sorter = new Sorter(new QuickSort());
        int arrExpected[] = {1,2,3,4,5,6,7,8,9,10};
        long startTime = System.nanoTime();
        sorter.sort(arr);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Quick Sort 3 - Time taken: " + elapsedTime + " ns");
        assertArrayEquals(arrExpected, arr);
    }

    @Test
    void test_quickSort4()
    {
        int arr[] = {-5,-10,3,-1,4,-2,0,6,-3,1};
        Sorter sorter = new Sorter(new QuickSort());
        int arrExpected[] = {-10,-5,-3,-2,-1,0,1,3,4,6};
        long startTime = System.nanoTime();
        sorter.sort(arr);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Quick Sort 4 - Time taken: " + elapsedTime + " ns");
        assertArrayEquals(arrExpected, arr);
    }
    @Test
    void test_mergeSort1()
    {
        int arr[] = {12,2,6,10,14,1,3,5,7,9};
        Sorter sorter = new Sorter(new MergeSort());
        int arrExpected[] = {1,2,3,5,6,7,9,10,12,14};
        long startTime = System.nanoTime();
        sorter.sort(arr);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Merge Sort 1 - Time taken: " + elapsedTime + " ns");
        assertArrayEquals(arrExpected, arr);
    }

    @Test
    void test_mergeSort2()
    {
        int arr[] = {5,4,3,1,6,1,4,2,5,7};
        Sorter sorter = new Sorter(new MergeSort());
        int arrExpected[] = {1,1,2,3,4,4,5,5,6,7};
        long startTime = System.nanoTime();
        sorter.sort(arr);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Merge Sort 2 - Time taken: " + elapsedTime + " ns");
        assertArrayEquals(arrExpected, arr);
    }

    @Test
    void test_mergeSort3()
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Sorter sorter = new Sorter(new MergeSort());
        int arrExpected[] = {1,2,3,4,5,6,7,8,9,10};
        long startTime = System.nanoTime();
        sorter.sort(arr);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Merge Sort 3 - Time taken: " + elapsedTime + " ns");
        assertArrayEquals(arrExpected, arr);
    }

    @Test
    void test_mergeSort4()
    {
        int arr[] = {-5,-10,3,-1,4,-2,0,6,-3,1};
        Sorter sorter = new Sorter(new MergeSort());
        int arrExpected[] = {-10,-5,-3,-2,-1,0,1,3,4,6};
        long startTime = System.nanoTime();
        sorter.sort(arr);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Radix Sort 4 - Time taken: " + elapsedTime + " ns");
        assertArrayEquals(arrExpected, arr);
    }
    @Test
    void test_radixSort1()
    {
        int arr[] = {12,2,6,10,14,1,3,5,7,9};
        Sorter sorter = new Sorter(new RadixSort());
        int arrExpected[] = {1,2,3,5,6,7,9,10,12,14};
        long startTime = System.nanoTime();
        sorter.sort(arr);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Radix Sort 1 - Time taken: " + elapsedTime + " ns");
        assertArrayEquals(arrExpected, arr);
    }

    @Test
    void test_radixSort2()
    {
        int arr[] = {5,4,3,1,6,1,4,2,5,7};
        Sorter sorter = new Sorter(new RadixSort());
        int arrExpected[] = {1,1,2,3,4,4,5,5,6,7};
        long startTime = System.nanoTime();
        sorter.sort(arr);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Radix Sort 2 - Time taken: " + elapsedTime + " ns");
        assertArrayEquals(arrExpected, arr);
    }

    @Test
    void test_radixSort3()
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Sorter sorter = new Sorter(new RadixSort());
        int arrExpected[] = {1,2,3,4,5,6,7,8,9,10};
        long startTime = System.nanoTime();
        sorter.sort(arr);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Radix Sort 3 - Time taken: " + elapsedTime + " ns");
        assertArrayEquals(arrExpected, arr);
    }

    @Test
    void test_radixSort4()
    {
        int arr[] = {-5,-10,3,-1,4,-2,0,6,-3,1};
        Sorter sorter = new Sorter(new RadixSort());
        int arrExpected[] = {-10,-5,-3,-2,-1,0,1,3,4,6};
        long startTime = System.nanoTime();
        sorter.sort(arr);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Radix Sort 4 - Time taken: " + elapsedTime + " ns");
        assertArrayEquals(arrExpected, arr);
    }
}