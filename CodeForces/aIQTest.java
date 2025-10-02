import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
      
        int countEvens = 0;
        int countOdds = 0;
        int lastOdd = 0;
        int lastEven = 0;
      
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                countEvens++;
                lastEven = i;
            }  else {
                countOdds++;
                lastOdd = i;
            }
        }
      
        if(countEvens > countOdds) {
            System.out.println(++lastOdd);
        } else if(countEvens < countOdds) {
            System.out.println(++lastEven);
        }
    }
}
