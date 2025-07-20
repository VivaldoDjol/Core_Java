import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numContests = sc.nextInt();
        int minScore = sc.nextInt();
        int maxScore = minScore;
        int count = 0;

        for (int i = 1; i < numContests; i++) {
            int currScore = sc.nextInt();

            if (currScore < minScore) {
                minScore = currScore;
                count++;
            } else if (currScore > maxScore) {
                maxScore = currScore;
                count++;
            }
        }
        System.out.println(count);
    }
}
