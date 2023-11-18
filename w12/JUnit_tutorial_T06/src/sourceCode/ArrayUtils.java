package sourceCode;

public class ArrayUtils {
    public int findSmallestMissingPositive(int[] array) {
        int n = array.length;
        boolean[] present = new boolean[n + 1];
        for (int i = 0; i < n; i++) { // iterate through entire array
            if (array[i] > 0 && array[i] <= n) {
                present[array[i]] = true;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }
        return n + 1;
    }
}
