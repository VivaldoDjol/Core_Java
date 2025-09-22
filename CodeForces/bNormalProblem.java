import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        sc.nextLine();

        while (tests-- > 0) {
            String s = sc.next();
            StringBuilder builder = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == 'p') {
                    builder.append('q');
                } else if (s.charAt(i) == 'q') {
                    builder.append('p');
                } else {
                    builder.append(s.charAt(i));
                }
            }
            System.out.println(builder);
        }
        sc.close();
    }
}
