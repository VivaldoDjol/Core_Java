import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long x = sc.nextLong();

        int distressedKids = 0;

        for (int i = 0; i < n; i++) {
            String operation = sc.next();
            long d = sc.nextLong();

            if (operation.equals("+")) {
                x += d;
            } else {
                if (x >= d) {
                    x -= d;
                } else {
                    distressedKids++;
                }
            }
        }
        System.out.println(x + " " + distressedKids);
        sc.close();
    }
}
