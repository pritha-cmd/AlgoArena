public class leet1572 {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];               // Primary diagonal
            sum += mat[i][n - 1 - i];       // Secondary diagonal
        }

        // If n is odd, subtract the middle element (counted twice)
        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }

    // Example
    public static void main(String[] args) {
        leet1572 obj = new leet1572();
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int result = obj.diagonalSum(mat);
        System.out.println(result);
    }
}
