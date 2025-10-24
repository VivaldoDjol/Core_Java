import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            long t1 = Math.abs((long) a - 1);
            long t2 = Math.abs((long) b - c) + Math.abs((long) c - 1);

            if (t1 < t2) {
                System.out.println(1);
            } else if (t1 > t2) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }
        sc.close();
    }
}
