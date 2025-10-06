import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maxPieces = 0;

        for (int i = 0; i <= n / a; i++) {
            for (int j = 0; j <= n / b; j++) {
                int remaining = n - (i * a + j * b);
                if (remaining < 0) break;
                if (remaining % c == 0) {
                    int k = remaining / c;
                    maxPieces = Math.max(maxPieces, i + j + k);
                }
            }
        }
        System.out.println(maxPieces);
    }
}

//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        final int NEG = -1_000_000_000;
//        int[] dp = new int[n + 1];
//        Arrays.fill(dp, NEG);
//        dp[0] = 0;
//
//        for (int i = 1; i <= n; i++) {
//            if (i >= a && dp[i - a] != NEG) dp[i] = Math.max(dp[i], dp[i - a] + 1);
//            if (i >= b && dp[i - b] != NEG) dp[i] = Math.max(dp[i], dp[i - b] + 1);
//            if (i >= c && dp[i - c] != NEG) dp[i] = Math.max(dp[i], dp[i - c] + 1);
//        }
//
//        System.out.println(dp[n]);
//    }
//}
