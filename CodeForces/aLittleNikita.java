import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (m <= n && (n - m) % 2 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}
