package testCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sourceCode.RangeCategorizer;

class TestRangeCategorizer {

    private final RangeCategorizer categorizer = new RangeCategorizer();

    @Test
    public void whenNumberIsNegative_thenCategorizeAsNegative() {
        assertEquals("Negative", categorizer.categorize(-1));
    }

    @Test
    public void whenNumberIsSingleDigit_thenCategorizeAsSingleDigit() {
        assertEquals("Single Digit", categorizer.categorize(5));
    }

    @Test
    public void whenNumberIsDoubleDigits_thenCategorizeAsDoubleDigits() {
        assertEquals("Double Digits", categorizer.categorize(50));
    }

    @Test
    public void whenNumberIsTripleDigits_thenCategorizeAsTripleDigits() {
        assertEquals("Triple Digits", categorizer.categorize(500));
    }

    @Test
    public void whenNumberIsFourDigits_thenCategorizeAsFourDigits() {
        assertEquals("Four Digits", categorizer.categorize(5000));
    }

    @Test
    public void whenNumberIsFiveDigits_thenCategorizeAsFiveDigits() {
        assertEquals("Five Digits", categorizer.categorize(50000));
    }

    @Test
    public void whenNumberIsLargeNumber_thenCategorizeAsLargeNumber() {
        assertEquals("Large Number", categorizer.categorize(100000));
    }

    @Test
    public void whenNumberIsUndefined_thenCategorizeAsUndefined() {
        // It's actually impossible to reach the "Undefined" case given the current logic,
        // since all integers will match one of the defined categories.
        // This test is just for demonstration and should actually never pass.
        assertEquals("Undefined", categorizer.categorize(Integer.MAX_VALUE));
    }

}
