import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        String[][] matrix = new String[rows][cols];
        boolean flag = true;
        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {
                matrix[i][j] = sc.next();
                if(matrix[i][j].equals("C") || matrix[i][j].equals("M") || matrix[i][j].equals("Y")) {
                    flag = false;
                }
            }
        }
        if(!flag) {
            System.out.println("#Color");
        }  else {
            System.out.println("#Black&White");
        }
    }
}
