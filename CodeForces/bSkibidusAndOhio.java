import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            String s = sc.next();
            char[] arr = s.toCharArray();
            boolean flag = false;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] == arr[i - 1]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(arr.length);
            } else {
                System.out.println(1);
            }
        }
    }
}
