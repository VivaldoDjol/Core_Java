import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        for (int i = 0; i < tests; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int max = 0;
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                if (arr[j] == 0) {
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println(0);
                continue;
            }
            int count = 1;
            for (int j = 1; j < n; j++) {
                if (arr[j] == arr[j - 1] && arr[j] == 0) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 1;
                }
            }
            if(n==1 && arr[0]==0){
                System.out.println(1);
            }else {
                System.out.println(Math.max(max, count));
            }
        }
    }
}
