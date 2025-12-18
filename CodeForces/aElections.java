import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long maxBC = Math.max(b, c);
            long maxAC = Math.max(a, c);
            long maxAB = Math.max(a, b);

            long A = Math.max(0, maxBC - a + 1);
            long B = Math.max(0, maxAC - b + 1);
            long C = Math.max(0, maxAB - c + 1);

            System.out.printf("%d %d %d%n", A, B, C);
        }
        sc.close();
    }
}
