import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while(tests-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int uniquePosition = 0;
            int repeatedNum = 0;
            for(int i = 0; i < n; i++){
                if(arr[0] == arr[1]){
                    repeatedNum = arr[0];
                } else{
                    repeatedNum = arr[2];
                }
                if (arr[i] != repeatedNum){
                    uniquePosition = i;
                }
            }
            System.out.println(uniquePosition + 1);
        }
    }
}
