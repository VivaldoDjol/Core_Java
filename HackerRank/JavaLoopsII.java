import java.util.Scanner;

/**
 * @author Vivaldo Djol
 *
 */
 
class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int cont = 1;
            int result = a;

            for (int j = 0; j < n; j++) {
                result = result + cont * b;
                System.out.print(result + " ");
                cont = cont * 2;
            }
            System.out.println();
        }
        in.close();
    }
}
