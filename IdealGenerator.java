import java.util.*;

public class IdealGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // Number of test cases
        while (t-- > 0) {
            int k = sc.nextInt();

            if (k % 2 != 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
