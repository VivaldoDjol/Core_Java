import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while(tests-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int count = 0;
            int stolen = 0;
            for(int i = 0; i < n; i++) {
                if(arr[i] >= k) {
                    stolen += arr[i];
                } else if(arr[i] == 0 && stolen > 0) {
                    count++;
                    stolen--;
                }
            }
            System.out.println(count);
        }
    }
}
