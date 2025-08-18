//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int tests = sc.nextInt();
//        for (int i = 0; i < tests; i++) {
//            int n = sc.nextInt();
//            String s = sc.next();
//
//            ArrayList<Integer> stringArr = new ArrayList<>();
//            for (char c : s.toCharArray()) {
//                stringArr.add(c - '0');
//            }
//            while (stringArr.size() >= 2) {
//                if (stringArr.get(0) == 1 && stringArr.get(stringArr.size() - 1) == 0
//                        || stringArr.get(0) == 0 && stringArr.get(stringArr.size() - 1) == 1) {
//                    stringArr.remove(0);
//                    stringArr.remove(stringArr.size() - 1);
//                } else {
//                    break;
//                }
//            }
//            System.out.println(stringArr.size());
//        }
//    }
//}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        for (int i = 0; i < tests; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            int left = 0;
            int right = n - 1;

            while (left < right) {
                if ((s.charAt(left) == '0' && s.charAt(right) == '1') ||
                        (s.charAt(left) == '1' && s.charAt(right) == '0')) {
                    left++;
                    right--;
                } else {
                    break;
                }
            }
            System.out.println(right - left + 1);
        }
        sc.close();
    }
}
