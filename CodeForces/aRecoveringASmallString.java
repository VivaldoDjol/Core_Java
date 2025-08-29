import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();

            int c = Math.min(26, n - 2);
            int b = Math.min(26, n - 1 - c);
            int a = n - b - c;

            char ch1 = (char) ('a' + a - 1);
            char ch2 = (char) ('a' + b - 1);
            char ch3 = (char) ('a' + c - 1);

            System.out.println("" + ch1 + ch2 + ch3);
        }
    }
}

//import java.util .*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int tests = sc.nextInt();
//        while (tests-- > 0) {
//            int n = sc.nextInt();
//            for (int first = 1; first <= 26; first++) {
//                for (int second = 1; second <= 26; second++) {
//                    int third = n - first - second;
//                    if (third >= 1 && third <= 26) {
//                        char c1 = (char) ('a' + first - 1);
//                        char c2 = (char) ('a' + second - 1);
//                        char c3 = (char) ('a' + third - 1);
//                        System.out.println("" + c1 + c2 + c3);
//                        first = 27;
//                        break;
//                    }
//                }
//            }
//        }
//    }
//}
