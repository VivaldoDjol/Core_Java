import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < 2 * n; i++) {
                for(int j = 0 ; j <2 * n; j++){
                    System.out.print(((i / 2 + j / 2) & 1) == 1 ? '.' : '#');
                }
                System.out.println();
            }
        }
    }
}
