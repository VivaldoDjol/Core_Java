import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tableCard = sc.next();
        char tableRank = tableCard.charAt(0);
        char tableSuit = tableCard.charAt(1);

        boolean canPlay = false;
        for (int i = 0; i < 5; i++) {
            String handCard = sc.next();
            char rank = handCard.charAt(0);
            char suit = handCard.charAt(1);

            if (rank == tableRank || suit == tableSuit) {
                canPlay = true;
            }
        }
        System.out.println(canPlay ? "YES" : "NO");
        sc.close();
    }
}
