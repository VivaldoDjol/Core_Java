import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        StringBuilder output = new StringBuilder();

        while (tests-- > 0) {
            int n = sc.nextInt();
            long[] b = new long[n];
            
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
            }

            List<Long> a = new ArrayList<>();
            a.add(b[0]);

            for (int i = 1; i < n; i++) {
                if (b[i] < b[i - 1]) {
                    a.add(b[i]);
                    a.add(b[i]);
                } else {
                    a.add(b[i]);
                }
            }

            output.append(a.size()).append("\n");
            for (int i = 0; i < a.size(); i++) {
                output.append(a.get(i)).append(i + 1 == a.size() ? "\n" : " ");
            }
        }
        System.out.print(output);
        sc.close();
    }
}
