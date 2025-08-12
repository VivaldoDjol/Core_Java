import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = Integer.parseInt(sc.nextLine());

        while (tests-- > 0) {
            String b = sc.nextLine();
            StringBuilder a = new StringBuilder();

            a.append(b.charAt(0));
            for (int i = 1; i < b.length(); i += 2) {
                a.append(b.charAt(i));
            }

            System.out.println(a);
        }
        sc.close();
    }
}
