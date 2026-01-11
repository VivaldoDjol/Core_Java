import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            int sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i] < 0){
                    arr[i] = -arr[i];
                }
                sum += arr[i];
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
