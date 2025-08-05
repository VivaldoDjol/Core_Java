import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        for (int i = 0; i < tests; i++) {
            String a = sc.next();
            System.out.println(a.charAt(0) - '0' + a.charAt(1) - '0');
        }
    }
}
