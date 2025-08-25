import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0){
            String s = sc.next();
            int a = Integer.parseInt(s.substring(0,s.indexOf('+')));
            int b = Integer.parseInt(s.substring(s.indexOf('+')));
            System.out.println(a + b);
        }
    }
}
