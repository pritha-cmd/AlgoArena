package leet;

public class leet66{
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // simple increment
                return digits;
            }
            digits[i] = 0; // carry-over needed
        }

        // All digits were 9 (e.g., 999 -> 1000)
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
