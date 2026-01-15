import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int m = sc.nextInt();
            int strPoint = 0;
            int lastR = 0;
            boolean flag = false;

            for (int i = 0; i < n; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();

                if (l - strPoint >= s) {
                    flag = true;
                } else if (l - lastR >= s) {
                    flag = true;
                } else if (n - 1 == i && m - r >= s) {
                    flag = true;
                }
                lastR = r;
                strPoint = r;
            }
            if (!flag) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
