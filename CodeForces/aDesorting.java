import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        
        while (tests-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            boolean bad = false;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    bad = true;
                    break;
                }
            }
            
            if (bad) {
                System.out.println(0);
                continue;
            }

            long ans = Long.MAX_VALUE;
            
            for (int i = 0; i < n - 1; i++) {
                long diff = a[i + 1] - a[i];
                long ops = diff / 2 + 1;
                
                if (ops < ans) ans = ops;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
