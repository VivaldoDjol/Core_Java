import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            int n = sc.nextInt();

            long total = b;
            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                total += Math.min(x, a - 1);
            }
            System.out.println(total);
        }
        sc.close();
    }
}
