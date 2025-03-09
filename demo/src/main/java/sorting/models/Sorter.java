package sorting.models;

import sorting.models.Sorts.Sort;

public class Sorter {
    private Sort sort;

    public Sorter(Sort sort) {
        this.sort = sort;
    }

    public void sort(int[] arr) {
        sort.sort(arr);
    }
}
