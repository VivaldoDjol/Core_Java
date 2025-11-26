import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        if (t == 10 && n == 1) {
            System.out.println(-1);
        } else if (t <10){
            for (int i = 1; i <= n; i++) {
                sb.append(t);
            }
            System.out.println(sb);
        } else {
            for (int i = 1; i <= n; i++) {
                if (i < n){
                    sb.append(1);
                } else {
                    sb.append(0);
                }
            }
            System.out.println(sb);
        }
    }
}
