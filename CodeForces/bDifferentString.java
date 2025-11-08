import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            String s = sc.next();
            boolean flag = true;

            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(0)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("NO");
            } else {
                char[] arr = s.toCharArray();
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] != arr[0]) {
                        char tmp = arr[0];
                        arr[0] = arr[i];
                        arr[i] = tmp;
                        break;
                    }
                }
                System.out.println("YES");
                System.out.println(new String(arr));
            }
        }
    }
}
