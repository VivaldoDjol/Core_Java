import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            Set<Character> seen = new HashSet<>();

            char prev = s.charAt(0);
            boolean flag = true;

            for (int i = 1; i < n; i++) {
                char curr = s.charAt(i);

                if (curr != prev) {
                    seen.add(prev);
                    if (seen.contains(curr)) {
                        flag = false;
                        break;
                    }
                }
                prev = curr;
            }
            System.out.println(flag ? "YES" : "NO");
        }
    }
}
