import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int count = 3;
            int n = 4;
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();

            }
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[0] > arr[i+1]){
                    count--;
                }
            }
            System.out.println(count);
        }
    }
}
