import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            long n = sc.nextLong();
            int res = 0;

            for (long pw = 1; pw <= n; pw = pw * 10 + 1) {
                for (int d = 1; d <= 9; d++) {
                    if (pw * d <= n) {
                        res++;
                    }
                }
            }
            System.out.println(res);
        }
        sc.close();
    }
}
