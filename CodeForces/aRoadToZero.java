import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();

            long singleMove = (x + y) * a;
            long doubleMove = Math.min(x, y) * b + Math.abs(x - y) * a;

            System.out.println(Math.min(singleMove, doubleMove));
        }
        sc.close();
    }
}
