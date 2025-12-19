import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();

            if (n > 0 && n <= 9) {
                System.out.println(n);
            } else {
                int newNum = n;
                int numLength = (int) Math.log10(n) + 1;

                while (newNum >= 10) {
                    newNum /= 10;
                }
                System.out.println((9 * numLength) - (9 - newNum));
            }
        }
    }
}
