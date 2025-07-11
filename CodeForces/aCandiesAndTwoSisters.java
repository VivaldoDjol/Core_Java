import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int num = sc.nextInt();

            if(num % 2 == 0) {
                num = (num / 2) - 1;
                System.out.println(num);
            } else {
                num /= 2;
                System.out.println(num);
            }
        }
    }
}
