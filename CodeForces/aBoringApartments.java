import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while(tests-- > 0){
            String num = sc.next();
            int numLength = num.length();

            int digit = Integer.parseInt(num) % 10;
            int total = 0;
            if(numLength == 1){
               total = digit * 10 - 9;
               System.out.println(total);
            } else if (numLength == 2){
                total = digit * 10 - 7;
                System.out.println(total);
            } else if (numLength == 3){
                total = digit * 10 - 4;
                System.out.println(total);
            } else if (numLength == 4){
                total = digit * 10;
                System.out.println(total);
            }
        }
    }
}
