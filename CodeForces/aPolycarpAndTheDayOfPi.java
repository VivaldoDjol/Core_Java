import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String PI = "314159265358979323846264338327950288419716939937510";
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        sc.nextLine();
        while (tests-- > 0) {
            String n = sc.nextLine().trim();
            int correct = 0;
            for (int i = 0; i < n.length(); i++) {
                if (i >= PI.length() || n.charAt(i) != PI.charAt(i)) {
                    break;
                }
                correct++;
            }
            System.out.println(correct);
        }
        sc.close();
    }
}
