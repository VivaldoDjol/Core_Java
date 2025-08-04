import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        String word = "codeforces";

        while(tests-->0){
            int count = 0;
            String letter = sc.next();
            char[] wordArray = (word.toCharArray());
            for (char c : wordArray) {
                if (c == letter.charAt(0)) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
