import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n - 1];
        
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        
        int curr = 1;
        while (curr < t) {
            curr = curr + arr[curr - 1];
        }
        
        if (curr == t) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
