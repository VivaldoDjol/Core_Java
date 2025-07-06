import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        int l = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        boolean[] damagedDragons = new boolean[d + 1];

        int damagedCount = 0;

        if (k > 0) {
            for (int i = k; i <= d; i += k) {
                if (!damagedDragons[i]) { // Only count if not already marked
                    damagedDragons[i] = true;
                    damagedCount++;
                }
            }
        }

        if (l > 0) {
            for (int i = l; i <= d; i += l) {
                if (!damagedDragons[i]) {
                    damagedDragons[i] = true;
                    damagedCount++;
                }
            }
        }

        if (m > 0) {
            for (int i = m; i <= d; i += m) {
                if (!damagedDragons[i]) {
                    damagedDragons[i] = true;
                    damagedCount++;
                }
            }
        }

        if (n > 0) {
            for (int i = n; i <= d; i += n) {
                if (!damagedDragons[i]) {
                    damagedDragons[i] = true;
                    damagedCount++;
                }
            }
        }
        System.out.println(damagedCount);
    }
}
