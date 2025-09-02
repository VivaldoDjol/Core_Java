import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            String first = sc.next();
            String second = sc.next();

            int count = 0;
            for (int i = 0; i < n; i++) {
                char a = first.charAt(i);
                char b = second.charAt(i);

                if (a != b) {
                    count++;
                }
                if ((a == 'G' && b == 'B') || (a == 'B' && b == 'G')) {
                    count--;
                }
            }

            if (count == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
