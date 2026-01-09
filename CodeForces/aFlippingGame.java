import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int originalOnes = 0;
        for (int x : a) {
            if (x == 1) originalOnes++;
        }

        int[] gain = new int[n];
        for (int i = 0; i < n; i++) {
            gain[i] = (a[i] == 0) ? 1 : -1;
        }

        int maxGains = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < n; i++) {
            currSum += gain[i];
            maxGains = Math.max(maxGains, currSum);
            currSum = Math.max(currSum, 0);
        }
        System.out.println(originalOnes + maxGains);
    }
}
