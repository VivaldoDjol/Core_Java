import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        String sCodeForces = "codeforces";

        for (int i = 0; i < tests; i++) {
            int count = 0;
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j) != sCodeForces.charAt(j)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
