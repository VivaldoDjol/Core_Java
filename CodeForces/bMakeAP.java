import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            boolean ok = false;

            long targetA = 2L * b - c;
            if (targetA > 0 && targetA % a == 0) {
                ok = true;
            }

            long sumAC = a + c;
            long denomB = 2L * b;
            if (sumAC % denomB == 0) {
                ok = true;
            }

            long targetC = 2L * b - a;
            if (targetC > 0 && targetC % c == 0) {
                ok = true;
            }
            System.out.println(ok ? "YES" : "NO");
        }
        sc.close();
    }
}
