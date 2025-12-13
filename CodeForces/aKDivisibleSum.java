import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            long total = ((n + k - 1) / k) * k;
            long ans = (total + n - 1) / n;
            System.out.println(ans);
        }
    }
}
