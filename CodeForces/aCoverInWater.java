import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        sc.nextLine();

        while (tests-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean hasThreeDots = false;
            for (int j = 1; j < n - 1; j++) {
                if (s.charAt(j - 1) == '.' && s.charAt(j) == '.' && s.charAt(j + 1) == '.') {
                    hasThreeDots = true;
                    break;
                }
            }

            if (hasThreeDots) {
                System.out.println(2);
            } else {
                int counter = 0;
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '.') counter++;
                }
                System.out.println(counter);
            }
        }
        sc.close();
    }
}
