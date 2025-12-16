import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long x = sc.nextLong();
        
        long count = 0;
        
        for (long i = 1; i * i <= x && i <= n; i++) {
            if (x % i == 0) {
                long j = x / i;
                
                if (j <= n) {
                    if (i == j) {
                        count += 1;
                    } else {
                        count += 2;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
