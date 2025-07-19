import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int contestTime = 240;
        int timeLeft = contestTime - k;

        int solvedProblems = 0;
        int solvingTime = 0;

        for (int i = 1; i <= n; i++) {
            int currProblemTime = 5 * i;

            if (solvingTime + currProblemTime <= timeLeft) {
                solvingTime += currProblemTime;
                solvedProblems++;
            } else {
                break;
            }
        }
        System.out.println(solvedProblems);
    }
}
