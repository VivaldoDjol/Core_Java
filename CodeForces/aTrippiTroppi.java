import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        sc.nextLine();

        while(tests-- > 0) {
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < s.length(); i++) {
                if (i == 0){
                    sb.append(s.charAt(i));
                }
                else if(s.charAt(i) == ' ') {
                    sb.append(s.charAt(i+1));
                    i++;
                }
            }
            System.out.println(sb);
        }
    }
}
