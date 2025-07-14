import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int number = sc.nextInt();

            if (number < 10) {
                System.out.println("1");
                System.out.println(number);
                continue;
            }

            ArrayList<Integer> result = new ArrayList<>();
            int current = number;

            while (current > 0) {
                if (current < 10) {
                    result.add(current);
                    break;
                }

                int digitCount = (int) Math.log10(current) + 1;
                int powerOfTen = (int) Math.pow(10, digitCount - 1);
                int firstDigit = current / powerOfTen;
                int leadingRoundNumber = firstDigit * powerOfTen;

                result.add(leadingRoundNumber);

                if (current == leadingRoundNumber) {
                    break;
                }

                current %= leadingRoundNumber;
            }

            System.out.println(result.size());
            for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i));
                if (i < result.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
