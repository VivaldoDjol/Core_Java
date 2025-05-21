import java.util.*;

/**
 * @author Vivaldo Djol
 */

public class Solution {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int lineNumber = 1;
            while (sc.hasNext()) {
                String lineContent = sc.nextLine();
                System.out.println(lineNumber + " " + lineContent);
                lineNumber++;
            }
        }
    }
}
