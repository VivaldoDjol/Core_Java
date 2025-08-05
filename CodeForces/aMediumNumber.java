import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        for (int i = 0; i < tests; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int min = Math.min(a, Math.min(b, c));
            int max = Math.max(a, Math.max(b, c));

            if (min == a && max == b || min == b && max == a) {
                System.out.println(c);
            } else if (min == c && max == b || min == b && max == c) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        }
    }
}
