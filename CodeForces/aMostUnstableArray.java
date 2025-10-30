import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(Math.min(2, n - 1) * m);
        }
        sc.close();
    }
}
