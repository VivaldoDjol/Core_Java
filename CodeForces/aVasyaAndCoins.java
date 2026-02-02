import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0) {
                System.out.println(1);
            } else {
                System.out.println(a + 2 * b + 1);
            }
        }
        sc.close();
    }
}
