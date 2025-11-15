import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            long sum = 0;
            for (int i = 0; i < n - 1; i++) {
                sum += sc.nextInt();
            }
            System.out.println(-sum);
        }
        sc.close();
    }
}
