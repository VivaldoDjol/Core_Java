import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        for(int i = 0; i < tests; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = Math.min(a, b);

            System.out.println((c - a) + (b - c));
        }
    }
}
