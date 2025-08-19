import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            if (n != 5) {
                System.out.println("NO");
                continue;
            }

            ArrayList<Character> list = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                list.add(' ');
            }

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == 'T') {
                    list.set(0, c);
                } else if (c == 'i') {
                    list.set(1, c);
                } else if (c == 'm') {
                    list.set(2, c);
                } else if (c == 'u') {
                    list.set(3, c);
                } else if (c == 'r') {
                    list.set(4, c);
                }
            }

            if (list.toString().equals("[T, i, m, u, r]")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
