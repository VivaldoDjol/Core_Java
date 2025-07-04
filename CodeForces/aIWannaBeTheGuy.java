import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] xLine = br.readLine().split(" ");
        String[] yLine = br.readLine().split(" ");

        Set<Integer> testsPassed = new HashSet<>();

        for (int i = 1; i < xLine.length; i++) {
            int test = Integer.parseInt(xLine[i]);
            if (test >= 1 && test <= n) {
                testsPassed.add(test);
            }
        }

        for (int i = 1; i < yLine.length; i++) {
            int test = Integer.parseInt(yLine[i]);
            if (test >= 1 && test <= n) {
                testsPassed.add(test);
            }
        }

        System.out.println(testsPassed.size() == n ? "I become the guy." : "Oh, my keyboard!");
    }
}
