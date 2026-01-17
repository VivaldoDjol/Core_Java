import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            boolean checkIfOddParIsOdd = false;
            boolean checkIfOddParIsEven = false;
            boolean checkIfEvenParIsOdd = false;
            boolean checkIfEvenParIsEven = false;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    if (arr[i] % 2 == 0) {
                        checkIfEvenParIsEven = true;
                    } else {
                        checkIfEvenParIsOdd = true;
                    }
                } else {
                    if (arr[i] % 2 == 0) {
                        checkIfOddParIsEven = true;
                    } else {
                        checkIfOddParIsOdd = true;
                    }
                }
            }
            if ((checkIfEvenParIsOdd && checkIfEvenParIsEven) || (checkIfOddParIsOdd && checkIfOddParIsEven)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
