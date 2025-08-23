import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int min = 9;
            int pos = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] < min) {
                    min = arr[i];
                    pos = i;
                }
            }
            arr[pos] += 1;
            int total = 1;
            for (int j : arr) {
                total *= j;
            }
            System.out.println(total);
        }
    }
}
