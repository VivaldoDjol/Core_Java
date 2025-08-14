import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        for (int i = 0; i < tests; i++) {
            int n = sc.nextInt();

            if((n/2) % 2 != 0) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");
            StringBuilder result = new StringBuilder();
            long firstHalfSum = 0;

            for (int j = 0; j < n/2; j++) {
                int num = (j + 1) * 2;
                firstHalfSum += num;
                result.append(num).append(" ");
            }

            long secondHalfSum = 0;
            for (int j = 0; j < n/2 - 1; j++) {
                int num = 2 * j + 1;
                secondHalfSum += num;
                result.append(num).append(" ");
            }

            long lastNumber = firstHalfSum - secondHalfSum;
            result.append(lastNumber);

            System.out.println(result);
        }
    }
}
