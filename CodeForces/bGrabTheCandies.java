import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while(tests-- > 0) {
            int n = sc.nextInt();
            int odds = 0;
            int evens = 0;
            for(int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if(num % 2 == 0) {
                    evens+=num;
                } else{
                    odds+=num;
                }
            }
            if(evens > odds) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
