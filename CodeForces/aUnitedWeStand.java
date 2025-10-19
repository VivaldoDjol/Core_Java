import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            if (arr[0] == arr[n - 1]) {
                System.out.println(-1);
            } else {

                int it = 0;
                while (it < n && arr[it] == arr[0]) it++;
                System.out.println(it + " " + (n - it));

                for (int j = 0; j < it; j++) System.out.print(arr[j] + " ");
                System.out.println();

                for (int j = it; j < n; j++) System.out.print(arr[j] + " ");
                System.out.println();
            }
        }
    }
}
