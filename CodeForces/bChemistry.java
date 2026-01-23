import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
        
        while (tests-- > 0) {
            String[] nk = br.readLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            String s = br.readLine();
            
            int remaining = n - k;
            
            int[] freq = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }
            
            int pairs = 0;
            int oddCount = 0;
            for (int count : freq) {
                pairs += count / 2;
                if (count % 2 == 1) {
                    oddCount++;
                }
            }
            
            boolean possible = false;
            if (remaining % 2 == 0) {
                if (remaining <= 2 * pairs) {
                    possible = true;
                }
            } else {
                int maxOddLength = 2 * pairs + (oddCount > 0 ? 1 : 0);
                if (remaining <= maxOddLength) {
                    possible = true;
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
    }
}
