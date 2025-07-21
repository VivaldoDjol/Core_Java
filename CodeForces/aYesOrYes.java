import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while(tests-- > 0){
            String s = sc.next();
            if(s.toLowerCase().equals("yes")){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
