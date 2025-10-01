import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max;

        int first = a + b * c;
        int second = a * (b + c);
        int third = a * b * c;
        int fourth = (a + b) * c;
        int fifth = a + b + c;

        max = Math.max(Math.max(first, second),Math.max(third, fourth) );
        System.out.println(Math.max(max, fifth));
    }
}
