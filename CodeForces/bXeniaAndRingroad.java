import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        long totalTime = 0;
        int currentPos = 1;

        for (int i = 0; i < m; i++) {
            int target = sc.nextInt();

            if (target >= currentPos) {
                totalTime += target - currentPos;
            } else {
                totalTime += n - currentPos + target;
            }

            currentPos = target;
        }
        System.out.println(totalTime);
        sc.close();
    }
}
