import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if (d >= b && a - b >= c - d) {
                System.out.println((d - b) + ((a + d - b) - c));
            } else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
