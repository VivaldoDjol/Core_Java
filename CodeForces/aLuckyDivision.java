import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int[] lucky = {
                4, 7,
                44, 47, 74, 77,
                444, 447, 474, 477, 744, 747, 774, 777
        };

        boolean almostLucky = false;
        for (int k : lucky) {
            if (n % k == 0) {
                almostLucky = true;
                break;
            }
        }
        System.out.println(almostLucky ? "YES" : "NO");
    }
}
