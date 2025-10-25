import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        
        while (tests-- > 0) {
            long x = sc.nextLong();
            System.out.println("1 " + (x - 1));
        }
        sc.close();
    }
}
