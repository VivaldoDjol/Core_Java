import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            int count = sc.nextInt();

            ArrayList<Integer> currentSequence = new ArrayList<>();

            if (sc.hasNextLine()) {
                String numbersLine = sc.nextLine();
                Scanner lineScanner = new Scanner(numbersLine);

                for (int i = 0; i < count; i++) {
                    if (lineScanner.hasNextInt()) {
                        currentSequence.add(lineScanner.nextInt());
                    }
                }
                lineScanner.close();
            }
                for (int i = 0; i < currentSequence.size(); i++) {
                System.out.print(currentSequence.get(i) + (i == currentSequence.size() - 1 ? "" : " "));
            }
        }
        sc.close();
    }
}
