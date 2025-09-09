import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        int moves = 0;
        char current = 'a';

        for (char target : word.toCharArray()) {
            int diff = Math.abs(target - current);
            moves += Math.min(diff, 26 - diff);
            current = target;
        }
        System.out.println(moves);
    }
}
