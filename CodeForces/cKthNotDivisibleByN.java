import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            
            long ans;
            if (k % (n - 1) == 0) {
                ans = (n * (k / (n - 1))) - 1;
            } else {
                ans = (n * (k / (n - 1))) + (k % (n - 1));
            }
            System.out.println(ans);
        }
    }
}
