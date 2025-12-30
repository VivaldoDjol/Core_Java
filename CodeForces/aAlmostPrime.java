import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;

        for (int x = 2; x <= n; x++) {
            int temp = x;
            int distinct = 0;

            if (temp % 2 == 0) {
                distinct++;
                while (temp % 2 == 0) temp /= 2;
            }

            for (int p = 3; p * p <= temp; p += 2) {
                if (temp % p == 0) {
                    distinct++;
                    while (temp % p == 0) temp /= p;
                }
            }

            if (temp > 1) distinct++;

            if (distinct == 2) ans++;
        }
        sc.close();
        System.out.println(ans);
    }
}
