import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            int cost = n * a;
            if (b < 2 * a) {
                cost = (n / 2) * b + (n % 2) * a;
            }
            System.out.println(cost);
        }
        sc.close();
    }
}
