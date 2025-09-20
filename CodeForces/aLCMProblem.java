import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x * 2 > y){
                System.out.println("-1 -1");
            } else {
                System.out.println(x + " " + (x * 2));
            }
        }
    }
}
