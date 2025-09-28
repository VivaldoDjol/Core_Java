import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a > b && Math.abs(a - b) % 2 == 0 || a < b && Math.abs(b - a) % 2 != 0) {
                System.out.println(1);
            } else if (a == b) {
                System.out.println(0);
            } else {
                System.out.println(2);
            }
        }
    }
}
