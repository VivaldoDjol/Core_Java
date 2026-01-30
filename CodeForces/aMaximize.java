import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0) {
            int x = sc.nextInt();
            System.out.println(x - 1);
        }
        sc.close();
    }
}
