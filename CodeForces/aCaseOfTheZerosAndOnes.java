import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int zeros = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') zeros++;
        }
        int ones = n - zeros;
        int result = Math.abs(zeros - ones);

        System.out.println(result);
        sc.close();
    }
}
