import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        sc.nextLine();

        while(tests-- > 0){
            StringBuilder out = new StringBuilder();

            for(int i = 0; i < 8; i++){
                String row = sc.nextLine();
                for(int j = 0; j < row.length(); j++){
                    char c = row.charAt(j);
                    if(c != '.'){
                        out.append(c);
                    }
                }
            }
            System.out.println(out);
        }
        sc.close();
    }
}
