import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while(tests-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            int lastLetterFound = 0;

            for(int i = 0; i < n; i++){
                lastLetterFound = Math.max(lastLetterFound, s.charAt(i) - 'a' + 1);
                if (lastLetterFound == 26) break;
            }
            System.out.println(lastLetterFound);
        }
    }
}
