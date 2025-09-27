import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while(tests-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String s = sc.next();

            Map<Character, Integer> countMap = new HashMap<>();

            for (char c : s.toCharArray()) {
                countMap.put(c, countMap.getOrDefault(c, 0) + 1);
            }

            int totalCount = 0;
            for (char c = 'A'; c <= 'G'; c++) {
                int count = countMap.getOrDefault(c, 0);
                if (count < m) {
                    totalCount += (m - count);
                }
            }
            System.out.println(totalCount);
        }
    }
}
