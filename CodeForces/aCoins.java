import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            if (n % 2 == 0) {
                System.out.println("YES");
            } else {
                if (k % 2 == 0) {
                    System.out.println("NO");
                } else {
                    if (n >= k) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
        sc.close();
    }
}
