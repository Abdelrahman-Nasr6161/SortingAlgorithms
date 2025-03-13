package sorting.models;

import java.util.List;

import sorting.models.Sorts.Sort;

public class Sorter {
    private Sort sort;

    public Sorter(Sort sort) {
        this.sort = sort;
    }
    public Sorter() {
    }

    public List<int[]> sort(int[] arr) {
        return sort.sort(arr);
    }
    public String getName() {
        return sort.getName();
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }
}
