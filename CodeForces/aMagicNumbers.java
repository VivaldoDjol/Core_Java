import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int i = 0;
        while (i < s.length()) {
            if (s.startsWith("144", i)) {
                i += 3;
            } else if (s.startsWith("14", i)) {
                i += 2;
            } else if (s.startsWith("1", i)) {
                i += 1;
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
