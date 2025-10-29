import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int totalTwos = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 2) {
                    totalTwos++;
                }
            }
            int halfTwos = 0;
            if (totalTwos == 0) {
                System.out.println(1);
            } else if (totalTwos % 2 != 0) {
                System.out.println(-1);
            } else {
                for (int i = 0; i < n; i++) {
                    if (arr[i] == 2) {
                        halfTwos++;
                    }
                    if (halfTwos == totalTwos / 2) {
                        System.out.println(i + 1);
                        break;
                    }
                }
            }
        }
    }
}
