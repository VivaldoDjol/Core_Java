import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            int k = n / 2;
            System.out.println(k);
            for (int i = 0; i < k; i++) {
                System.out.print(2);
                if (i < k - 1) System.out.print(" ");
            }
        } else {
            int k = (n - 3) / 2 + 1;
            System.out.println(k);
            System.out.print(3);
            for (int i = 0; i < (n - 3) / 2; i++) {
                System.out.print(" 2");
            }
        }
        sc.close();
    }
}
