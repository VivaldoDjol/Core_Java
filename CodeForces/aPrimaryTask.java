import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            String a = sc.next();

            if (a.length() < 3 || !a.startsWith("10")) {
                System.out.println("NO");
                continue;
            }

            String suffix = a.substring(2);

            if (suffix.charAt(0) == '0') {
                System.out.println("NO");
                continue;
            }

            try {
                long x = Long.parseLong(suffix);
                if (x >= 2) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } catch (NumberFormatException e) {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
