import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int tests =  sc.nextInt();

        while(tests-- > 0){
            int k = sc.nextInt();

            System.out.println((k%2==0) ? "NO" : "YES");
        }
    }
}
