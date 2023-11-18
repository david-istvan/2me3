package testCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sourceCode.ArrayUtils;

class TestArrayUtils {

    @Test
    public void whenArrayHasAllPositiveIntegers_thenFindNextPositive() {
        ArrayUtils utils = new ArrayUtils();
        int[] array = {1, 2, 3, 4, 5};
        int result = utils.findSmallestMissingPositive(array);
        assertEquals(6, result, "The smallest missing positive should be 6, Your result is: " + result);
    }

    @Test
    public void whenArrayHasMissingPositiveIntegers_thenFindSmallestMissing() {
        ArrayUtils utils = new ArrayUtils();
        int[] array = {3, 4, -1, 1};
        assertEquals(2, utils.findSmallestMissingPositive(array), "The smallest missing positive should be 2");
    }

    @Test
    public void whenArrayIsEmpty_thenFirstPositiveIsOne() {
        ArrayUtils utils = new ArrayUtils();
        int[] array = {};
        assertEquals(1, utils.findSmallestMissingPositive(array), "The smallest missing positive should be 1");
    }

    @Test
    public void whenArrayHasOnlyNegativeIntegers_thenFirstPositiveIsOne() {
        ArrayUtils utils = new ArrayUtils();
        int[] array = {-1, -2, -3};
        assertEquals(1, utils.findSmallestMissingPositive(array), "The smallest missing positive should be 1");
    }
}
