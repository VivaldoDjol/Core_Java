import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while(tests-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            int[] pos = new int[n];
            for(int i = 0; i < n; i++) {
                String s = sc.nextLine();
                int index = s.indexOf("#");
                pos[i] = index + 1;
            }
            StringBuilder sb = new StringBuilder();
            for(int i = n-1; i >= 0; i--) {
                sb.append(pos[i]);
                sb.append(" ");
            }
            System.out.println(sb);
        }
    }
}
