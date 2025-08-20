import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        
        while(tests-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int count = 0;
            HashSet<Character> seen = new HashSet<>();
            
            for(int i = 0; i < n; i++) {
                char currentChar = s.charAt(i);
                if (!seen.contains(currentChar)) {
                    count += 2;
                    seen.add(currentChar);
                } else {
                    count += 1;
                }
            }
            System.out.println(count);
        }
    }
}
