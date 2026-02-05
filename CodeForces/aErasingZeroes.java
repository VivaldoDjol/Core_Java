import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
      
        while (tests-- > 0) {
            String s = sc.next();
            int first = s.indexOf('1');
            int last = s.lastIndexOf('1');
            if (first == -1) {
                System.out.println(0);
            } else {
                int zeros = 0;
                for (int i = first; i <= last; i++) {
                    if (s.charAt(i) == '0') zeros++;
                }
                System.out.println(zeros);
            }
        }
        sc.close();
    }
}
