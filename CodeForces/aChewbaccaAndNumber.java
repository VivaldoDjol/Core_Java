import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] digits = s.toCharArray();

        for (int i = 0; i < digits.length; i++) {
            int d = digits[i] - '0';
            int flipped = 9 - d;

            if (i == 0) {
                if (flipped < d && flipped != 0) {
                    digits[i] = (char) (flipped + '0');
                }
            } else {
                if (flipped < d) {
                    digits[i] = (char) (flipped + '0');
                }
            }
        }
        sc.close();
        System.out.println(new String(digits));
    }
}
