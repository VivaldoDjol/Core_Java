import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[] nArr = new int[n];
            int[] mArr = new int[m];

            for (int i = 0; i < n; i++) {
                nArr[i] = sc.nextInt();
            }
            for(int j = 0; j < m; j++) {
                mArr[j] = sc.nextInt();
            }
            int counter  = 0;
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    if(nArr[i] + mArr[j] <= k) {
                        counter++;
                    }
                }
            }
            System.out.println(counter);
        }
    }
}
