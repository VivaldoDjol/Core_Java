import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0) {
            String s = sc.next();
            String sFirst = s.substring(0, 3);
            String sSecond = s.substring(3, 6);
            char[] sFirstArray = sFirst.toCharArray();
            char[] sSecondArray = sSecond.toCharArray();
            int sumFirst = 0;
            int sumSecond = 0;
            for (char c : sFirstArray) {
                sumFirst += c - '0';
            }
            for (char c : sSecondArray) {
                sumSecond += c - '0';
            }
           if(sumFirst == sumSecond){
               System.out.println("YES");
           } else {
               System.out.println("NO");
           }
        }
    }
}
