import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        for (int i = 0; i < tests; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = 0;
            int resultMask = 0;
            if (a == b) {
                System.out.println(0);
            } else if (a < b) {
                result = b - a;
                resultMask = result;
                if ((result %= 10) == 0){
                    System.out.println(resultMask/10);
                }
                else {
                    System.out.println(resultMask/10 + 1);
                }
            } else {
                result = a - b;
                resultMask = result;
                if ((result %= 10) == 0){
                    System.out.println(resultMask/10);
                }
                else {
                    System.out.println(resultMask/10 + 1);
                }
            }
        }
    }
}
