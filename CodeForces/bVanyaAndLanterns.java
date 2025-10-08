import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxDist = Integer.MIN_VALUE;
        Arrays.sort(arr);

        for (int i = 1; i < n; i++) {
            int dRadius = Math.abs(arr[i] - arr[i - 1]);
            if (dRadius > maxDist) {
                maxDist = dRadius;
            }
        }

        double leftDist = arr[0];
        double rightDist = l - arr[n - 1];
        double maxEdgeDist = Math.max(leftDist, rightDist);
        double result = (double) maxDist/2;

        System.out.println(Math.max(maxEdgeDist, result));
    }
}
