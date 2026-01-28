import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while(tests-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int max  = 0;
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            System.out.println(max);
        }
    }
}
