import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(reader.readLine());

        while(tests-- > 0) {
            String s = reader.readLine();
            if(s.length() % 2 != 0) {
                System.out.println("NO");
            } else {
                int half = s.length()/2;
                String firstHalf = s.substring(0, half);
                String secondHalf = s.substring(half);
                if(firstHalf.compareTo(secondHalf) == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
