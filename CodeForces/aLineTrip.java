import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int nStations = sc.nextInt();
            int xDestiny = sc.nextInt();

            int[] nStops = new int[nStations];
            for (int i = 0; i < nStations; i++) {
                nStops[i] = sc.nextInt();
            }
            if (nStations == 1) {
                System.out.println(Math.max(nStops[0], 2 * (xDestiny - nStops[0])));
            } else {
                int prev = 0;
                int maxDistance = nStops[0];
                for (int j = 1; j < nStops.length; j++) {
                    prev = nStops[j] - nStops[j - 1];
                    maxDistance = Math.max(maxDistance, prev);
                }
                System.out.println(Math.max(maxDistance, 2 * (xDestiny - nStops[nStops.length - 1])));
            }
        }
    }
}
