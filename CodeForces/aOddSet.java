import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int cntEven = 0, cntOdd = 0;

            for (int i = 0; i < 2 * n; i++) {
                int x = sc.nextInt();
                if (x % 2 == 0) cntEven++;
                else cntOdd++;
            }
            System.out.println(cntEven == cntOdd ? "Yes" : "No");
        }
        sc.close();
    }
}
