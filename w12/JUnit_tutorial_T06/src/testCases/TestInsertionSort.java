package testCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sourceCode.SortingAlgorithms;

class TestInsertionSort {

    @Test
    public void testInsertionSortWithTypicalArray() {
        int[] actual = {5, 2, 9, 1, 5, 6};
        SortingAlgorithms.insertionSort(actual);
        int[] expected = {1, 2, 5, 5, 6, 9};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertionSortWithSingleElement() {
        int[] actual = {1};
        SortingAlgorithms.insertionSort(actual);
        int[] expected = {1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertionSortWithDuplicateElements() {
        int[] actual = {2, 2, 2};
        SortingAlgorithms.insertionSort(actual);
        int[] expected = {2, 2, 2};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertionSortWithNegativeNumbers() {
        int[] actual = {-3, -1, -2, -5, -4};
        SortingAlgorithms.insertionSort(actual);
        int[] expected = {-5, -4, -3, -2, -1};
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testInsertionSort_IncorrectStartingIndex() {
        // This test case is designed to catch the bug where the sort starts from the wrong index.
        int[] actual = {5, 4, 3, 2, 1};
        SortingAlgorithms.insertionSort(actual);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, actual, "The array is not sorted correctly.");
    }

    @Test
    public void testInsertionSort_KeyNotReInserted() {
        // This test case is designed to catch the bug where the key is not re-inserted into the array.
        int[] actual = {2, 4, 1, 3, 5}; // The key 1 should be re-inserted at index 0.
        SortingAlgorithms.insertionSort(actual);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, actual, "The array is not sorted correctly.");
    }
}


