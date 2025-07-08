import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cleanedUpS = sc.nextLine().replaceAll("[{},\\s]+","");
        boolean [] flag = new boolean[26];
        char[] cleanedUpSToArray = cleanedUpS.toCharArray();
        for (char c : cleanedUpSToArray) {
            if (c >= 'a' && c <= 'z') {
                int uniqueIndex = c - 'a';
                flag[uniqueIndex] = true;
            }
        }
        int count = 0;
        for(boolean flags:flag){
            if(flags){
                count++;
            }
        }
        System.out.println(count);
    }

}
