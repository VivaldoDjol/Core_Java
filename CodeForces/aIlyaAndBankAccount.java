import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        
        if (s.charAt(0) != '-') {
            long original = Long.parseLong(s);
            long option1 = original;
            long option2 = Long.parseLong(s.substring(0, s.length() - 1));
            long option3 = Long.parseLong(s.substring(0, s.length() - 2) + s.charAt(s.length() - 1));
            System.out.println(Math.max(option1, Math.max(option2, option3)));
        } else {
            String digits = s.substring(1);
            long original = Long.parseLong(s);
            
            String option2Str = "-" + digits.substring(0, digits.length() - 1);
            long option2 = Long.parseLong(option2Str);
            
            String option3Str = "-" + digits.substring(0, digits.length() - 2) + digits.charAt(digits.length() - 1);
            long option3 = Long.parseLong(option3Str);
            
            long max1 = Math.max(original, option2);
            long result = Math.max(max1, option3);
            System.out.println(result);
        }
    }
}
