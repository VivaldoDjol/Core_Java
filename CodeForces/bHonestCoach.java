import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while(tests-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int result = arr[n-1] - arr[0];

            for(int i = 0; i < n; i++) {
                for(int j = i+1; j < n; j++) {
                    result = Math.min(result, arr[j] - arr[i]);
                }
            }
            System.out.println(result);
        }
    }
}
