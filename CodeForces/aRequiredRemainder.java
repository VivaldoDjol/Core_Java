import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = sc.nextInt();

            int max_q = (n - y) / x;
            int k = max_q * x + y;

            System.out.println(k);
        }
        sc.close();
    }
}
