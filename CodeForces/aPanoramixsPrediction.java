import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (m % 2 == 1 && isPrime(m) && isConsecutivePrimes(n, m)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    private static boolean isConsecutivePrimes(int n, int m) {
        for (int i = n + 1; i < m; i++) {
            if (isPrime(i)) return false;
        }
        return true;
    }
}
