import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while (test-- > 0) {
            int a = sc.nextInt();
            int diff = 180 - a;

            if (360 % diff == 0) {
                int n = 360 / diff;
                System.out.println(n >= 3 ? "YES" : "NO");
            } else {
                System.out.println("NO");
            }
        }
    }
}
