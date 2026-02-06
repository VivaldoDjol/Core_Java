import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        final int INF = 1000;
        int[][] dp = new int[n + 1][3];
        dp[0][0] = 0;
        dp[0][1] = INF;
        dp[0][2] = INF;

        for (int i = 1; i <= n; i++) {
            dp[i][0] = 1 + Math.min(dp[i - 1][0], Math.min(dp[i - 1][1], dp[i - 1][2]));

            if (a[i] == 1 || a[i] == 3) {
                dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]);
            } else {
                dp[i][1] = INF;
            }
            if (a[i] == 2 || a[i] == 3) {
                dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]);
            } else {
                dp[i][2] = INF;
            }
        }

        int ans = Math.min(dp[n][0], Math.min(dp[n][1], dp[n][2]));

        System.out.println(ans);
        sc.close();
    }
}