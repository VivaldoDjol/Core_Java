import java.util.Scanner;

public class MagicalSticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0) {
            long n = sc.nextLong();
            System.out.println((n + 1) / 2);
        }
        sc.close();
    }
}
