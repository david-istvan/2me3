package testCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sourceCode.SortingAlgorithms;

class TestMergeSort {

    @Test
    public void testMergeSortWithTypicalArray() {
        int[] actual = {38, 27, 43, 3, 9, 82, 10};
        SortingAlgorithms.mergeSort(actual);
        int[] expected = {3, 9, 10, 27, 38, 43, 82};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMergeSortWithSingleElement() {
        int[] actual = {42};
        SortingAlgorithms.mergeSort(actual);
        int[] expected = {42};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMergeSortWithEmptyArray() {
        int[] actual = {};
        SortingAlgorithms.mergeSort(actual);
        int[] expected = {};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMergeSortWithIdenticalElements() {
        int[] actual = {1, 1, 1, 1};
        SortingAlgorithms.mergeSort(actual);
        int[] expected = {1, 1, 1, 1};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testMergeSort_IncorrectMiddleCalculation() {
        // This test case is designed to catch the bug where the middle index is calculated incorrectly.
        int[] actual = {4, 1, 3, 2};
        SortingAlgorithms.mergeSort(actual);
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, actual, "The array is not sorted correctly.");
    }
    @Test
    public void testQuickSort_InefficientPivotChoice() {
        // This test case is designed to catch the bug where an inefficient pivot choice is made.
        int[] actual = {2, 8, 7, 1, 3, 5, 6, 4};
        SortingAlgorithms.quickSort(actual);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(expected, actual, "The array is not sorted correctly.");
    }

    @Test
    public void testQuickSort_IncorrectPivotPlacement() {
        // This test case is designed to catch the bug where the pivot might not be placed correctly.
        int[] actual = {3, 2, 1, 4, 5}; // The pivot 5 should end up at the last index after the first partition.
        SortingAlgorithms.quickSort(actual);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, actual, "The array is not sorted correctly.");
    }

}

