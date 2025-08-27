import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = Integer.parseInt(sc.nextLine().trim());
        while (tests-- > 0) {
            int sum = 0;

            for (int i = 0; i < 10; i++) {
                String input = sc.nextLine().trim();
                char[] chars = input.toCharArray();

                for (int j = 0; j < chars.length; j++) {
                    if (chars[j] == 'X') {
                        if (i == 0 || i == 9 || j == 0 || j == 9) {
                            sum += 1;
                        } else if (i == 1 || i == 8 || j == 1 || j == 8) {
                            sum += 2;
                        } else if (i == 2 || i == 7 || j == 2 || j == 7) {
                            sum += 3;
                        } else if (i == 3 || i == 6 || j == 3 || j == 6) {
                            sum += 4;
                        } else {
                            sum += 5;
                        }
                    }
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
