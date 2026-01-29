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

            int left = arr[0];
            int right = arr[0];
            boolean valid = true;

            for (int i = 1; i < n; i++) {
                int seat = arr[i];
                if (seat == left - 1) {
                    left--;
                } else if (seat == right + 1) {
                    right++;
                } else {
                    valid = false;
                }
            }
            System.out.println(valid ? "YES" : "NO");
        }
        sc.close();
    }
}
