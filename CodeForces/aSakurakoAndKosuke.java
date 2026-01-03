import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                System.out.println("Sakurako");
            } else {
                System.out.println("Kosuke");
            }
        }
        sc.close();
    }
}
