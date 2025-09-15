import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while(tests-- > 0){
            String s = sc.next();
            String s1 = s.substring(0, s.length()-2);
            String s2 = s.substring(s.length()-2);
            s2 = s2.replaceAll("us", "i");
            System.out.println(s1 + s2);
        }
    }
}
