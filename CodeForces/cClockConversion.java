import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = Integer.parseInt(sc.nextLine());

        while (tests-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(":");
            int hour24 = Integer.parseInt(parts[0]);
            String minute = parts[1];

            String period = hour24 < 12 ? "AM" : "PM";

            int hour12 = hour24 % 12;
            if (hour12 == 0) hour12 = 12;

            String hourStr = (hour12 < 10) ? "0" + hour12 : String.valueOf(hour12);

            System.out.println(hourStr + ":" + minute + " " + period);
        }
        sc.close();
    }
}
