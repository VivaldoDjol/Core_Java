import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0) {
            int n = sc.nextInt();
            Map<Integer, Integer> freq = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }

            int distinct = freq.size();
            if (distinct == 1) {
                System.out.println("YES");
            } else if (distinct == 2) {
                Iterator<Integer> it = freq.values().iterator();
                int c1 = it.next();
                int c2 = it.next();
                System.out.println(Math.abs(c1 - c2) <= 1 ? "YES" : "NO");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
