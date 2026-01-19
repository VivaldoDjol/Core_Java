import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while(tests-- > 0){
            int n = sc.nextInt();
            int[] candies = new int[n];

            for(int i = 0; i < n; i++){
                candies[i] = sc.nextInt();
            }

            int min = candies[0];
            for(int i = 1; i < n; i++){
                if(candies[i] < min){
                    min = candies[i];
                }
            }
            int total = 0;
            int sum = 0;
            for(int i = 0; i < n; i++){
                total = candies[i] - min;
                sum += total;
            }
            System.out.println(sum);
        }
    }
}
