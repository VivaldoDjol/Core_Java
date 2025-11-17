import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        
        while (tests-- > 0) {
            long n = sc.nextLong();
            
            if (n == 1) {
                System.out.println(0);
                continue;
            }
            
            int countTwos = 0;
            while (n % 2 == 0) {
                n /= 2;
                countTwos++;
            }
           
            int countThrees = 0;
            while (n % 3 == 0) {
                n /= 3;
                countThrees++;
            }
            
            if (n != 1 || countTwos > countThrees) {
                System.out.println(-1);
            } else {
                System.out.println(2 * countThrees - countTwos);
            }
        }
        sc.close();
    }
}
