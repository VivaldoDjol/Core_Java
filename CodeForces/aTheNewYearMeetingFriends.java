import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();

        int minPos = Math.min(Math.min(x1, x2), x3);
        int maxPos = Math.max(Math.max(x1, x2), x3);

        System.out.println(maxPos - minPos);
        scanner.close();
    }
}
