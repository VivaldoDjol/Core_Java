import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean flagLower = s.substring(1).chars().anyMatch(Character::isLowerCase);
        boolean flagUpper = s.chars().allMatch(Character::isUpperCase);

        if (flagLower) {
            System.out.println(s);
        } else if (flagUpper) {
            System.out.println(s.toLowerCase());
        } else {
            System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase());
        }
    }
}
