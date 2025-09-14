import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count >= 7) {
                    System.out.println("YES");
                    return;
                }
                count = 1;
            }
        }
        if (count >= 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
