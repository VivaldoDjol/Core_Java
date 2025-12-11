import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            String s = sc.next();
            int countDiff = 0;
            int countB = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'A' || s.charAt(i) == 'C') {
                    countDiff++;
                } else {
                    countB++;
                }
            }
            if (s.length() % 2 != 0) {
                System.out.println("NO");
            } else if(countDiff != countB) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
