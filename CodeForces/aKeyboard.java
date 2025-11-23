import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String direction = br.readLine().trim();
        String typed = br.readLine().trim();

        String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";

        StringBuilder result = new StringBuilder();
        for (char c : typed.toCharArray()) {
            int idx = keyboard.indexOf(c);
            if (direction.equals("L")) {
                result.append(keyboard.charAt(idx + 1));
            } else {
                result.append(keyboard.charAt(idx - 1));
            }
        }
        System.out.println(result.toString());
    }
}
