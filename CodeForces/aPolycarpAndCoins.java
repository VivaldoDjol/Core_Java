import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while(tests-- > 0){
            int coins = sc.nextInt();
            int c1 = coins/3;
            int c2 = coins/3;
            int modCoins = coins%3;
            if(modCoins == 0){
                System.out.println(c1 + " " + c2);
            } else if(modCoins == 1){
                c1++;
                System.out.println(c1 + " " + c2);
            }
            else if (modCoins == 2){
                c2++;
                System.out.println(c1 + " " + c2);
            }
        }
    }
}
