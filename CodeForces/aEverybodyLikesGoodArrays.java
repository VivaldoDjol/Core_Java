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

            if (n == 1) {
                System.out.println(0);
                continue;
            }

            int groups = 1;
            for (int i = 1; i < n; i++) {
                boolean prevEven = (arr[i - 1] % 2 == 0);
                boolean currEven = (arr[i] % 2 == 0);
                if (prevEven != currEven) {
                    groups++;
                }
            }
            System.out.println(n - groups);
        }
        sc.close();
    }
}
