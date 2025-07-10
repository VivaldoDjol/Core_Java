import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] homeColors = new int[n];
        int[] guestColors = new int[n];

        for (int i = 0; i < n; i++) {
            homeColors[i] = sc.nextInt();
            guestColors[i] = sc.nextInt();
        }

        int sameColors = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (homeColors[i] == guestColors[j]) {
                        sameColors++;
                    }
                }
            }
        }
        System.out.println(sameColors);
        sc.close();
    }
}
