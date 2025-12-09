import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        String t = sc.nextLine().trim();
        
        int pos = 0;
        for (int i = 0; i < t.length(); i++) {
            char instruction = t.charAt(i);
            if (pos < s.length() && s.charAt(pos) == instruction) {
                pos++;
            }
        }
        System.out.println(pos + 1);
    }
}
