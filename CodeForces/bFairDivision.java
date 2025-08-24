import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int ones = 0, twos = 0;

            for (int i = 0; i < n; i++) {
                int candy = sc.nextInt();
                if (candy == 1) ones++;
                else twos++;
            }

            int total = ones + 2 * twos;

            if (total % 2 != 0) {
                System.out.println("NO");
                continue;
            }
            if ((total / 2) % 2 != 0 && ones == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
