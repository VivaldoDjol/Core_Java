import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Integer[] nNumbers = new Integer[n];
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) {
            nNumbers[i] = Integer.parseInt(st.nextToken());
        }

        if (k == 0) {
            int min = nNumbers[0];
            for (int i = 1; i < n; i++) {
                if (nNumbers[i] < min) min = nNumbers[i];
            }
            if (min > 1) {
                System.out.println(min - 1);
            } else {
                System.out.println(-1);
            }
        } else if (k == n) {
            int max = nNumbers[0];
            for (int i = 1; i < n; i++) {
                if (nNumbers[i] > max) max = nNumbers[i];
            }
            System.out.println(max);
        } else {
            Arrays.sort(nNumbers);
            if (nNumbers[k].equals(nNumbers[k - 1])) {
                System.out.println(-1);
            } else {
                System.out.println(nNumbers[k - 1]);
            }
        }
        br.close();
    }
}
