import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int a1 = sc.nextInt(), a2 = sc.nextInt(), a4 = sc.nextInt(), a5 = sc.nextInt();
            int c1 = a1 + a2;
            int c2 = a4 - a2;
            int c3 = a5 - a4;

            int ans = 1;
            if (c1 == c2 && c2 == c3) ans = 3;
            else if (c1 == c2 || c1 == c3 || c2 == c3) ans = 2;
            System.out.println(ans);
        }
        sc.close();
    }
}
