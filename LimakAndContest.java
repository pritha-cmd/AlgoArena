import java.util.Scanner;

public class LimakAndContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of problems
        int k = sc.nextInt(); // minutes needed to get to the party

        int totalTime = 240 - k; // total time Limak can spend solving problems
        int timeSpent = 0;
        int problemsSolved = 0;

        // Try to solve problems from easiest to hardest
        for (int i = 1; i <= n; i++) {
            int timeForProblem = 5 * i;
            if (timeSpent + timeForProblem <= totalTime) {
                timeSpent += timeForProblem;
                problemsSolved++;
            } else {
                break; // no more time to solve next problem
            }
        }

        System.out.println(problemsSolved);

        sc.close();
    }
}
