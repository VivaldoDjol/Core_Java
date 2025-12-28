import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            String s = sc.next();
            int n = Integer.parseInt(s);

            int x = (int) Math.sqrt(n);

            if (x * x == n) {
                System.out.println(0 + " " + x);
            } else if ((x + 1) * (x + 1) == n) {
                System.out.println(0 + " " + (x + 1));
            } else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
