import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests  = sc.nextInt();

        while (tests-- > 0) {
            int n = 4;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (a > max) {
                    max = a;
                }
                if (a < min) {
                    min = a;
                }
            }
            sum = max - min;
            System.out.println(sum * sum);
        }
    }
}
