import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tests = sc.nextInt();
        while (tests-- > 0) {
            int n = sc.nextInt();
            int[] freq = new int[n + 1];
            int res = -1;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (freq[x] < 3) {
                    freq[x]++;
                    if (freq[x] == 3) {
                        res = x;
                    }
                }
            }
            System.out.println(res);
        }
        sc.close();
    }
}
