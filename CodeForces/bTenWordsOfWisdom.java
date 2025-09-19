import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            List<Integer> aWords = new ArrayList<>();
            List<Integer> bWords = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                aWords.add(sc.nextInt());
                bWords.add(sc.nextInt());
            }
            int max = -1;
            int maxPos = -1;
            for (int j = 0; j < n; j++) {
                if (aWords.get(j) <= 10){
                    if  (bWords.get(j) > max){
                        max = bWords.get(j);
                        maxPos = j;
                    }
                }
            }
            System.out.println(maxPos + 1);
        }
    }
}
