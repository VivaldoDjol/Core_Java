import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            long sum = 0;

            for (int i = 0; i < n; i++) {
                sum += sc.nextInt();
            }

            long diff = sum - n;
            long ans;

            if (diff == 0) {
                ans = 0;
            } else if (diff < 0) {
                ans = 1;
            } else {
                ans = diff;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
