package sourceCode;

public class RangeCategorizer {

    public String categorize(int number) {
        if (number < 0) {
            return "Negative";
        } else if (number >= 0 && number < 10) {
            return "Single Digit";
        } else if (number >= 10 && number < 100) {
            return "Double Digits";
        } else if (number >= 100 && number < 1000) {
            return "Triple Digits";
        } else if (number >= 1000 && number < 10000) {
            return "Four Digits";
        } else if (number >= 10000 && number < 100000) {
            return "Five Digits";
        } else if (number >= 100000) {
            return "Large Number";
        } else {
            return "Undefined";
        }
    }
}
