import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int months = 12;
        int[] arr = new int[months];

        int count = 0;
        if (k == 0) {
            System.out.println(count);
        } else {
            for (int i = 0; i < months; i++) {
                arr[i] = sc.nextInt();
            }
/*
            Arrays.sort(arr);

            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
*/
            int[] sorted = Arrays.stream(arr)
                    .boxed()
                    .sorted(Collections.reverseOrder())
                    .mapToInt(Integer::intValue)
                    .toArray();

            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                sum += sorted[i];
                count++;
                if (sum >= k) {
                    break;
                }
            }

            if (sum >= k) {
                System.out.println(count);
            } else {
                System.out.println(-1);
            }
        }
    }
}
