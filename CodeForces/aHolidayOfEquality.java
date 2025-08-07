//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int nCitizens = sc.nextInt();
//        int [] citizens = new int[nCitizens];
//        for (int i = 0; i < nCitizens; i++) {
//            citizens[i] = sc.nextInt();
//        }
//        int currentCitizenMax = 0;
//        for (int i = 0; i < nCitizens; i++) {
//            if(citizens[i] >= currentCitizenMax){
//                currentCitizenMax = citizens[i];
//            }
//        }
//        int sum = 0;
//        int count = 0;
//        for (int i = 0; i < nCitizens; i++) {
//            if(citizens[i] != currentCitizenMax){
//                count = currentCitizenMax - citizens[i];
//                sum += count;
//            }
//        }
//        System.out.println(sum);
//    }
//}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCitizens = sc.nextInt();

        int currentMax = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nCitizens; i++) {
            int value = sc.nextInt();
            if (value > currentMax) {
                sum += (currentMax != Integer.MIN_VALUE) ? (i * (value - currentMax)) : 0;
                currentMax = value;
            } else {
                sum += currentMax - value;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
