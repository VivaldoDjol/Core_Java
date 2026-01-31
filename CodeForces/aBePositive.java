import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        
        while (tests-- > 0) {
            int n = sc.nextInt();
            int zeros = 0;
            int negs = 0;
            
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (num == 0) {
                    zeros++;
                } else if (num == -1) {
                    negs++;
                }
            }
            
            int ops = zeros;
            if (negs % 2 == 1) {
                ops += 2;
            }
            System.out.println(ops);
        }
        sc.close();
    }
}
