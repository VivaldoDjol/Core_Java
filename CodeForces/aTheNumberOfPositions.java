import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int minFront = Math.max(a, n - 1 - b);
        int positions = Math.max(0, n - minFront);
        System.out.println(positions);
    }
}
