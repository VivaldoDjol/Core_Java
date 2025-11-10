import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int nTwos = sc.nextInt();

            int pileA = (int)Math.pow(2, nTwos);
            int pileB = 0;

            for (int i = 1; i < nTwos /2; i++) {
                pileA += (int)Math.pow(2, i);
            }

            for (int i = nTwos /2; i < nTwos; i++) {
                pileB += (int)Math.pow(2, i);
            }

            int difference = Math.abs(pileA - pileB);
            System.out.println(difference);
        }
        sc.close();
    }
}
