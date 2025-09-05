import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int nApartment = sc.nextInt();
            int apartPerFloor = sc.nextInt();

            if (nApartment <= 2) {
                System.out.println(1);
            } else {
                System.out.println(((nApartment - 3) / apartPerFloor) + 2);
            }

        }
    }
}
