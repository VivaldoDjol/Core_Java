import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();

            char[] arr = s.toCharArray();
            int x = 0, y = 0;
            boolean flag = false;

            for (int i = 0; i < n; i++) {
                if(arr[i] == 'U'){
                    x += 1;
                } else if(arr[i] == 'D'){
                    x -= 1;
                } else if(arr[i] == 'R'){
                    y += 1;
                }
                else if(arr[i] == 'L'){
                    y -= 1;
                }
                if(x == 1 && y == 1){
                    System.out.println("YES");
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println("NO");
            }
        }
    }
}
