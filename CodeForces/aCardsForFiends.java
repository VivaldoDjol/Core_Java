import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (tests-- > 0) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            int n = sc.nextInt();

            int a = 0;
            while (w % 2 == 0) {
                w /= 2;
                a++;
            }

            int b = 0;
            while (h % 2 == 0) {
                h /= 2;
                b++;
            }

            long maxSheets = 1L << (a + b);
            sb.append(maxSheets >= n ? "YES\n" : "NO\n");
        }
        System.out.print(sb);
    }
}
