import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int sum = 0;
            boolean odd = false;
            boolean even = false;

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                sum += num;
                if (num % 2 == 0) {
                    even = true;
                } else {
                    odd = true;
                }
            }
            if (sum % 2 != 0 || even && odd) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
