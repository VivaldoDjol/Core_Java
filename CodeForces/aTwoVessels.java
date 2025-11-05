import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long result = (Math.abs(a - b) + 2 * c - 1) / (2 * c);
            System.out.println(result);
        }
        sc.close();
    }
}
