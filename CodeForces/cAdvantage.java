import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int tests = Integer.parseInt(br.readLine());

        while (tests-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int strongest = Integer.MIN_VALUE;
            int secondStrongest = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                if (arr[i] > strongest) {
                    secondStrongest = strongest;
                    strongest = arr[i];
                } else if (arr[i] > secondStrongest) {
                    secondStrongest = arr[i];
                }
            }

            StringBuilder sb = new StringBuilder(n * 12 + 10);
            for (int i = 0; i < n; i++) {
                if (i > 0) sb.append(' ');
                if (arr[i] == strongest) {
                    sb.append(arr[i] - secondStrongest);
                } else {
                    sb.append(arr[i] - strongest);
                }
            }
            pw.println(sb);
        }
        pw.flush();
        pw.close();
        br.close();
    }
}
