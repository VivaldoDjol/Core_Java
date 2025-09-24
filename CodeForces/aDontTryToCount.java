import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();
            int counter = 0;

            for (int i = 0; i < 6; i++) {
                if (x.contains(s)) {
                    System.out.println(counter);
                    break;
                } else {
                    x += x;
                    counter++;
                }
            }
            if(!x.contains(s)){
                System.out.println(-1);
            }
        }
    }
}
