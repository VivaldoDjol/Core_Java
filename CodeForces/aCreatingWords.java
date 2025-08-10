import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        for (int i = 0; i < tests; i++) {
            String a = sc.next();
            String b = sc.next();

            char firstCharA = a.charAt(0);
            char firstCharB = b.charAt(0);

            String newA = firstCharB + a.substring(1);
            String newB = firstCharA + b.substring(1);

            System.out.println(newA + " " + newB);
        }
        sc.close();
    }
}
