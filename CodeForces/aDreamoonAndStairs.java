import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int minMoves = (n + 1) / 2;
        int k = ((minMoves + m - 1) / m) * m;
        
        if (k <= n) {
            System.out.println(k);
        } else {
            System.out.println(-1);
        }
    }
}
