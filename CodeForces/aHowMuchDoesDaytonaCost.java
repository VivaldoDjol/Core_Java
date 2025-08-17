import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        for( int i = 0; i < tests; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            int count = 0;

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                if (arr[j] == k) {
                    count++;
                }
            }
            if(count == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
