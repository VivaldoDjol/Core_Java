import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();

        int currSub = 1;
        int maxSub = 1;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if(arr[i] > arr [i-1]){
                currSub++;
                maxSub = Math.max(maxSub, currSub);
            } else {
                currSub = 1;
            }
        }
        System.out.println(maxSub);
    }
}
