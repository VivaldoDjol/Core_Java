import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        for (int i = 0; i < tests; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            if (n == 2) {
                if (arr[0] % 2 == 0 && arr[1] % 2 == 0 || arr[0] % 2 == 1 && arr[1] % 2 == 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                continue;
            }

            int totalSumBlue = arr[0] + arr[1];
            int totalSumRed = 0;

            for (int j = 2; j < n; j++) {
                totalSumRed += arr[j];
            }

            if (totalSumBlue % 2 == totalSumRed % 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
