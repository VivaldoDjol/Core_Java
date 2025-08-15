import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] caloriesPerStrip = new int[5];
        for (int i = 1; i <= 4; i++) {
            caloriesPerStrip[i] = scanner.nextInt();
        }

        scanner.nextLine();
        String s = scanner.nextLine();

        long totalCalories = 0;

        for (char eventChar : s.toCharArray()) {
            int stripNumber = eventChar - '0';
            totalCalories += caloriesPerStrip[stripNumber];
        }
        System.out.println(totalCalories);
        scanner.close();
    }
}
