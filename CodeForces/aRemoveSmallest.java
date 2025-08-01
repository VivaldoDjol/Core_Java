import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        for (int i = 0; i < tests; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            if (removeSmallest(arr)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean removeSmallest(int[] arr) {
        int nSize = arr.length;
        if (nSize == 1) return true;

        Arrays.sort(arr);

        for (int i = 1; i < nSize; i++) {
            if (arr[i] - arr[i - 1] > 1) {
                return false;
            }
        }
        return true;
    }
}
