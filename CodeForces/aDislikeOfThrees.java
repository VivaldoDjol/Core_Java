import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        ArrayList<Integer> polyList = new ArrayList<>();

        int currNumber = 1;
        while (polyList.size() < 1000) {
            if (currNumber % 3 != 0 && currNumber % 10 != 3) {
                polyList.add(currNumber);
            }
            currNumber++;
        }
        for (int i = 0; i < tests; i++) {
            int num = sc.nextInt();
            System.out.println(polyList.get(num - 1));
        }
    }
}
