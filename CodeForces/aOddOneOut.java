import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        for (int i = 0; i < tests; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int diffNumber = 0;
            if (a == b){
                diffNumber = c;
            } else if (b == c){
                diffNumber = a;
            } else if (a == c){
                diffNumber = b;
            }
            System.out.println(diffNumber);
        }
    }
}
