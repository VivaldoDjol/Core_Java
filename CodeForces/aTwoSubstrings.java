import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        int ab = s.indexOf("AB");
        if (ab != -1) {
            if (s.substring(0, ab).contains("BA") || 
                (ab + 2 <= s.length() && s.substring(ab + 2).contains("BA"))) {
                System.out.println("YES");
                return;
            }
        }

        int ba = s.indexOf("BA");
        if (ba != -1) {
            if (s.substring(0, ba).contains("AB") || 
                (ba + 2 <= s.length() && s.substring(ba + 2).contains("AB"))) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
