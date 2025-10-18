import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (tests-- > 0) {
            long x = sc.nextLong();
            int k = sc.nextInt();

            if (x % k != 0) {
                sb.append(1).append("\n").append(x).append("\n");
            } else {
                sb.append(2).append("\n").append(x - 1).append(" ").append(1).append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}
