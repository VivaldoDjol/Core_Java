import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            if (row % 2 == 1){
                for (int col = 1; col <= m; col++) {
                    System.out.print("#");
                }
            } else {
                if ((row / 2) % 2 == 1) {
                    for (int col = 1; col <= m; col++) {
                        if (col == m) {
                            System.out.print("#");
                        } else {
                            System.out.print(".");
                        }
                    }

                } else {
                    for (int col = 1; col <= m; col++) {
                        if (col == 1) {
                            System.out.print("#");
                        } else {
                            System.out.print(".");
                        }
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
