import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long minOps = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            long ops = Math.abs(a);
            if (ops < minOps) {
                minOps = ops;
            }
        }
        System.out.println(minOps);
        sc.close();
    }
}
