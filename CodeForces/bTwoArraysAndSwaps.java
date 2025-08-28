import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);
            for (int i = 0; i < n / 2; i++) {
                int temp = b[i];
                b[i] = b[n - 1 - i];
                b[n - 1 - i] = temp;
            }

            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (i < k) {
                    sum += Math.max(a[i], b[i]);
                } else {
                    sum += a[i];
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
