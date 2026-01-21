import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            ArrayList<Integer> ans = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int charLength = sc.nextInt();
                String s = sc.next();
                char[] sToChars = s.toCharArray();
                int currDigit = arr[j];

                for (int k = 0; k < charLength; k++) {
                    if (sToChars[k] == 'D') {
                        if (currDigit == 9) {
                            currDigit = 0;
                        } else {
                            currDigit += 1;
                        }
                    } else {
                        if (currDigit == 0) {
                            currDigit = 9;
                        } else {
                            currDigit -= 1;
                        }
                    }
                }
                ans.add(currDigit);
            }

            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i));
                if (i < ans.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
