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
    public String getName() {
        return sort.getName();
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }
}
