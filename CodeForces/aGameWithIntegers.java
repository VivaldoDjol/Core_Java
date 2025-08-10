import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        for (int i = 0; i < tests; i++) {
            int n = sc.nextInt();

            if(n%3 !=0){
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }
        sc.close();
    }
}
