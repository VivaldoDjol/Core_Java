import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            long m = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long rowA = Math.min(m, a);
            long rowB = Math.min(m, b);
            long remSeats = (m - rowA) + (m - rowB);
            long total = rowA + rowB + Math.min(remSeats, c);

            System.out.println(total);
        }
        sc.close();
    }
}
