import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            String pos = sc.next();
            char col = pos.charAt(0);
            char row = pos.charAt(1);

            for (char r = '1'; r <= '8'; r++) {
                if (r != row) {
                    System.out.println(col + "" + r);
                }
            }

            for (char c = 'a'; c <= 'h'; c++) {
                if (c != col) {
                    System.out.println(c + "" + row);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
