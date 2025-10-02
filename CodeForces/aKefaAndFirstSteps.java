//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        int count = 1;
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int maxCount = 1;
//        for (int i = 1; i < n; i++) {
//            if (arr[i] >= arr[i - 1]) {
//                count++;
//            } else {
//                count = 1;
//            }
//            maxCount = Math.max(maxCount, count);
//        }
//        System.out.println(maxCount);
//    }
//}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(0);
            return;
        }

        int prev = sc.nextInt();
        int currentLength = 1;
        int maxLength = 1;

        for (int i = 1; i < n; i++) {
            int curr = sc.nextInt();
            if (curr >= prev) {
                currentLength++;
            } else {
                currentLength = 1;
            }
            maxLength = Math.max(maxLength, currentLength);
            prev = curr;
        }
        sc.close();
        System.out.println(maxLength);
    }
}
