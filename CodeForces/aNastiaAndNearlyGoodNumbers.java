import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0) {
            long A = sc.nextLong();
            long B = sc.nextLong();

            if (B == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                if (B == 2) {
                    System.out.println(A + " " + (3 * A) + " " + (4 * A));
                } else {
                    System.out.println(A + " " + (A * (B - 1)) + " " + (A * B));
                }
            }
        }
        sc.close();
    }
}
