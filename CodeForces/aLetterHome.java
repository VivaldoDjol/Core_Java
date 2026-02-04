import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int minX = 101;
            int maxX = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x < minX) minX = x;
                if (x > maxX) maxX = x;
            }
            int ans;
            if (s <= minX) {
                ans = maxX - s;
            } else if (s >= maxX) {
                ans = s - minX;
            } else {
                ans = (maxX - minX) + Math.min(s - minX, maxX - s);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
