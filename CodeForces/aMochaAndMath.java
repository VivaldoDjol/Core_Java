import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        
        while (tests-- > 0) {
            int n = sc.nextInt();
            int result = sc.nextInt();
            
            for (int i = 1; i < n; i++) {
                result &= sc.nextInt();
            }
            System.out.println(result);
        }
        sc.close();
    }
}
