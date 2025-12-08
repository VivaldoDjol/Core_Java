import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int x = sc.nextInt();
            int n = sc.nextInt();
            if (n % 2 == 1) {
                System.out.println(x);
            } else {
                System.out.println(0);
            }
        }
        sc.close();
    }
}
