import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int hours = sc.nextInt();
            int minutes = sc.nextInt();

            hours *= 60;
            minutes += hours;
            minutes = 1440 - minutes;
            System.out.println(minutes);
        }
    }
}
