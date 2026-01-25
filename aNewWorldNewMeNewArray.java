import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        
        while (tests-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int p = sc.nextInt();
            
            int absK = Math.abs(k);
            
            if (absK == 0) {
                System.out.println(0);
            } else if (absK > n * p) {
                System.out.println(-1);
            } else {
                int operations = (absK + p - 1) / p;
                System.out.println(operations);
            }
        }
        sc.close();
    }
}
