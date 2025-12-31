import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        sc.nextLine();
        while (tests-- > 0) {
            String keyboard = sc.nextLine().trim();
            String s = sc.nextLine().trim();

            int[] pos = new int[26];
            for (int i = 0; i < 26; i++) {
                char c = keyboard.charAt(i);
                pos[c - 'a'] = i;
            }

            long time = 0;
            for (int i = 1; i < s.length(); i++) {
                int prev = pos[s.charAt(i - 1) - 'a'];
                int curr = pos[s.charAt(i) - 'a'];
                time += Math.abs(curr - prev);
            }
            System.out.println(time);
        }
        sc.close();
    }
}
