import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        sc.nextLine();

        while (tests-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String a = sc.nextLine().trim();

            int m = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine().trim();
            String c = sc.nextLine().trim();

            StringBuilder result = new StringBuilder(a);

            for (int i = 0; i < m; i++) {
                char ch = b.charAt(i);
                if (c.charAt(i) == 'V') {
                    result.insert(0, ch);
                } else {
                    result.append(ch);
                }
            }
            System.out.println(result);
        }
        sc.close();
    }
}
