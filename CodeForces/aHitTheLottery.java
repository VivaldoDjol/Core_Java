import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int totalBills = 0;

        totalBills += n / 100;
        n %= 100;

        totalBills += n / 20;
        n %= 20;

        totalBills += n / 10;
        n %= 10;

        totalBills += n / 5;
        n %= 5;

        totalBills += n;

        System.out.println(totalBills);
        scanner.close();
    }
}
