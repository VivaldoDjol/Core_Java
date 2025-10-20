import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            String x = sc.next();
            char minDigit = '9';
            for (char c : x.toCharArray()) {
                if (c < minDigit) minDigit = c;
            }
            System.out.println(minDigit - '0');
        }
    }
}
