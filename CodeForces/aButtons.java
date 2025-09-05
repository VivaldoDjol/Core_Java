//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int tests = sc.nextInt();
//
//        while (tests-- > 0) {
//            double a = sc.nextInt();
//            double b = sc.nextInt();
//            double c = sc.nextInt();
//
//            if (c % 2 == 0) {
//                if (a <= b) System.out.println("Second");
//                else System.out.println("First");
//
//            } else if (c % 2 != 0) {
//                if (a>=b) System.out.println("First");
//                else System.out.println("Second");
//            }
//        }
//    }
//}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (c % 2 == 0) {
                System.out.println(a > b ? "First" : "Second");
            } else {
                System.out.println(a >= b ? "First" : "Second");
            }
        }
    }
}
