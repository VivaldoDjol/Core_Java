import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while(tests-- > 0) {
            int n = sc.nextInt();
            String colors = sc.next();

            char[] arr = colors.toCharArray();
            int firstB = -1;
            int lastB = -1;

            for(int i = 0; i < n; i++) {
                if(arr[i] == 'B') {
                    if(firstB == -1) {
                        firstB = i;
                    }
                    lastB = i;
                }
            }
            System.out.println(lastB - firstB + 1);
        }
    }
}
