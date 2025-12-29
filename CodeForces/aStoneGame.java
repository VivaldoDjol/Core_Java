import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int minIdx = 0, maxIdx = 0;
            for (int i = 1; i < n; i++) {
                if (a[i] < a[minIdx]) minIdx = i;
                if (a[i] > a[maxIdx]) maxIdx = i;
            }

            int opt1 = (minIdx + 1) + (n - maxIdx);
            int opt2 = (maxIdx + 1) + (n - minIdx);
            int opt3 = Math.max(minIdx, maxIdx) + 1;
            int opt4 = n - Math.min(minIdx, maxIdx);

            int ans = Math.min(Math.min(opt1, opt2), Math.min(opt3, opt4));
            System.out.println(ans);
        }
        sc.close();
    }
}
