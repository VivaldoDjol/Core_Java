import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String newYear = sc.nextLine();
        String christmasMan = sc.nextLine();
        String shuffledNames = sc.nextLine();

        String test = newYear + christmasMan;
        
        // Convert strings to char arrays and sort them
        char[] testChars = test.toCharArray();
        char[] shuffledChars = shuffledNames.toCharArray();
        Arrays.sort(testChars);
        Arrays.sort(shuffledChars);

        // Compare the sorted arrays
        if(Arrays.equals(testChars, shuffledChars)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
        sc.close();
    }
}
