import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            long result = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                result += arr[i];
            }
            if (Math.sqrt(result)%1 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
