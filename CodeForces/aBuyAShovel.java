import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int r = sc.nextInt();

        int lastDigitK = k % 10;

        if (lastDigitK == 0) {
            System.out.println(1);
            sc.close();
            return;
        }

        int result = 10;

        for (int i = 1; i <= 10; i++) {
            int lastDigit = (i * lastDigitK) % 10;
            if (lastDigit == 0 || lastDigit == r) {
                result = i;
                break;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
