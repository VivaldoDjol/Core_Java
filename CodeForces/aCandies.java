import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        
        while (tests-- > 0) {
            long n = sc.nextLong();
            for (int k = 2; k <= 60; k++) {
                long denom = (1L << k) - 1;
                if (denom > n) break;
                if (n % denom == 0) {
                    System.out.println(n / denom);
                    break;
                }
            }
        }
        sc.close();
    }
}
