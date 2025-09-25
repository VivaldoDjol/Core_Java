import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            String[] s = new String[n];
            for (int i = 0; i < n; i++) {
                s[i] = sc.next();
            }

            StringBuilder sb = new StringBuilder();
            int left = 0, right = n - 1;
            boolean takeLeft = true;

            while (left <= right) {
                if (takeLeft) {
                    sb.append(s[left++]).append(" ");
                } else {
                    sb.append(s[right--]).append(" ");
                }
                takeLeft = !takeLeft;
            }

            System.out.println(sb.toString().trim());
        }
        sc.close();
    }
}
