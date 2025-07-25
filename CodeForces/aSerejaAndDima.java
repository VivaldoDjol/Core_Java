import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] cards = new int[n];

        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        int serejaScore = 0;
        int dimaScore = 0;
        int left = 0;
        int right = n - 1;

        for (int turn = 0; turn < n; turn++) {
            int chosenCard;

            if (cards[left] >= cards[right]) {
                chosenCard = cards[left];
                left++;
            } else {
                chosenCard = cards[right];
                right--;
            }

            if (turn % 2 == 0) {
                serejaScore += chosenCard;
            } else {
                dimaScore += chosenCard;
            }
        }
        System.out.println(serejaScore + " " + dimaScore);
        sc.close();
    }
}
