import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = Math.min(a, b);
        long fact = 1;

        for (int i = 2; i <= m; i++) {
            fact *= i;
        }

        System.out.println(fact);
        sc.close();
    }
}

