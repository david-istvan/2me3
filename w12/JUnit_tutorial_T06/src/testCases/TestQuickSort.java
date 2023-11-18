package testCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sourceCode.SortingAlgorithms;

class TestQuickSort {

    @Test
    public void testQuickSortWithTypicalArray() {
        int[] actual = {99, 5, 36, 7, 22, 17, 46, 12};
        SortingAlgorithms.quickSort(actual);
        int[] expected = {5, 7, 12, 17, 22, 36, 46, 99};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testQuickSortWithEmptyArray() {
        int[] actual = {};
        SortingAlgorithms.quickSort(actual);
        int[] expected = {};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testQuickSortWithSortedArray() {
        int[] actual = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        SortingAlgorithms.quickSort(actual);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testQuickSortWithReverseSortedArray() {
        int[] actual = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        SortingAlgorithms.quickSort(actual);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expected, actual);
    }
}


