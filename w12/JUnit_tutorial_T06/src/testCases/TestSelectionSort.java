package testCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sourceCode.SortingAlgorithms;

class TestSelectionSort {

    @Test
    public void testSelectionSortWithTypicalArray() {
        int[] actual = {64, 25, 12, 22, 11};
        SortingAlgorithms.selectionSort(actual);
        int[] expected = {11, 12, 22, 25, 64};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSelectionSortWithEmptyArray() {
        int[] actual = {};
        SortingAlgorithms.selectionSort(actual);
        int[] expected = {};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSelectionSortWithSortedArray() {
        int[] actual = {1, 2, 3, 4, 5};
        SortingAlgorithms.selectionSort(actual);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSelectionSortWithReverseArray() {
        int[] actual = {5, 4, 3, 2, 1};
        SortingAlgorithms.selectionSort(actual);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testSelectionSort_LastElementNotChecked() {
        // This test case is designed to catch the bug where the last element is not being considered in the sorting.
        int[] actual = {3, 2, 1, 0, 4}; // The number 4 should be the last to be checked.
        SortingAlgorithms.selectionSort(actual);
        int[] expected = {0, 1, 2, 3, 4};
        assertArrayEquals(expected, actual, "The array is not sorted correctly.");
    }

}
