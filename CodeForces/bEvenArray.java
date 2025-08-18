import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        for (int i = 0; i < tests; i++) {
            int n = sc.nextInt();
            int even_mismatch = 0;
            int odd_mismatch = 0;

            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();

                if (a % 2 != j % 2) {
                    if (j % 2 == 0) {
                        even_mismatch++;
                    }

                    else {
                        odd_mismatch++;
                    }
                }
            }

            if (even_mismatch != odd_mismatch) {
                System.out.println(-1);
            } else {
                System.out.println(even_mismatch);
            }
        }
    }
}
