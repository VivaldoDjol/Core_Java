import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int mask = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                mask |= (1 << (c - 'A'));
            } else if (c >= 'a' && c <= 'z') {
                mask |= (1 << (c - 'a'));
            }
        }

        System.out.println((mask == (1 << 26) - 1) ? "YES" : "NO");
    }
}
