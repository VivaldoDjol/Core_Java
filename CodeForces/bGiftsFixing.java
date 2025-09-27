import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int[] arrA = new int[n];
            int[] arrB = new int[n];
            for (int i = 0; i < n; i++) {
                arrA[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                arrB[i] = sc.nextInt();
            }

            int minA = arrA[0];
            int minB = arrB[0];
            for (int i = 1; i < n; i++) {
                if (arrA[i] < minA) minA = arrA[i];
                if (arrB[i] < minB) minB = arrB[i];
            }

            long ans = 0;
            for (int i = 0; i < n; i++) {
                ans += Math.max(arrA[i] - minA, arrB[i] - minB);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
