import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int[] arr = new int [3];
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();
            int n = sc.nextInt();

            Arrays.sort(arr);

            n  -=  2 * arr[2] - arr[1] - arr[0];

            if (n < 0 || n % 3 != 0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
