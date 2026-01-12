import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            String str = sc.next();

            char[] strToChars = str.toCharArray();
            int operations = 0;

            for (int i = 0; i < n; i++) {
                if (strToChars[i] == 'B') {
                    operations++;

                    for (int j = i; j < Math.min(i + k, n); j++) {
                        strToChars[j] = 'W';
                    }
                    i = i + k - 1;
                }
            }
            System.out.println(operations);
        }
        sc.close();
    }
}
