import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            int countNeg = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] < 0) {
                    countNeg++;
                }
            }

            int minOperations = Integer.MAX_VALUE;

            int maxPossibleNeg = n / 2;
            maxPossibleNeg = (maxPossibleNeg / 2) * 2;

            for (int finalNeg = 0; finalNeg <= maxPossibleNeg; finalNeg += 2) {
                int ops = Math.abs(countNeg - finalNeg);
                minOperations = Math.min(minOperations, ops);
            }
            System.out.println(minOperations);
        }
    }
}
