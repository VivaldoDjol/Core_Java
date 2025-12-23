import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] a = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            a[i][1] = 1;
            a[1][i] = 1;
        }

        int max = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= n; j++) {
                a[i][j] = a[i-1][j] + a[i][j-1];
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        System.out.println(max);
        sc.close();
    }
}
