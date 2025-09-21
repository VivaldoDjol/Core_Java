import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 != 0) {
            System.out.println("-1");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int result = (i % 2 == 1) ? i + 1 : i - 1;
            sb.append(result);
            if (i < n) sb.append(' ');
        }
        System.out.println(sb);
    }
}
