import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (b % 2 == 0 && a % 2 == 0) {
                System.out.println("YES");
            } else if (b % 2 != 0 && a % 2 == 0 && a >= 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
