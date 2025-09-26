import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int max = Math.max(x, Math.max(y, z));
            int min = 10;
            for (int i = 1; i <= max; i++) {
                int sum = Math.abs(x - i) + Math.abs(y - i) +  Math.abs(z - i);
                 min = Math.min(sum, min);
            }
            System.out.println(min);
        }
    }
}
