/// BRUTE FORCE
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        for(int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int q = sc.nextInt();
//        int[] qDays = new int[q];
//        for(int i = 0; i < q; i++) {
//            qDays[i] = sc.nextInt();
//        }
//
//        for(int i = 0; i < q; i++) {
//            int count = 0;
//            for(int j = 0; j < n; j++) {
//                if(qDays[i] >= arr[j]) {
//                    count++;
//                }
//            }
//            System.out.println(count);
//        }
//        sc.close();
//    }
//}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        Arrays.sort(prices);

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int m = sc.nextInt();

            int left = 0, right = n;
            while (left < right) {
                int mid = (left + right) / 2;
                if (prices[mid] <= m) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            System.out.println(left);
        }
        sc.close();
    }
}
