import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while(tests-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int winnerA = Math.max(a, b);
            int winnerB = Math.max(c, d);
            int loserA = Math.min(a, b);
            int loserB = Math.min(c, d);
            if(winnerA < loserB || winnerB < loserA){
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
