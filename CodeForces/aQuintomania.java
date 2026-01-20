import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean isPerfect = true;
            for (int i = 0; i < n - 1; i++) {
                int abs = Math.abs(arr[i] - arr[i + 1]);
                if (abs != 5 && abs != 7) {
                    isPerfect = false;
                    break;
                }
            }

            if (isPerfect) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
