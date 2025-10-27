import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while(tests-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int count = 0;
            while(n >= Math.max(a,b)) {
                if(a<b) {
                    a+=b;
                    count++;
                }
                else {
                    b+=a;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
