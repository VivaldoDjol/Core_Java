import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nFriends = sc.nextInt();
        int kBottles = sc.nextInt();
        int lMilliliters = sc.nextInt();
        int cLimes = sc.nextInt();
        int dSlices = sc.nextInt();
        int pGramsSalt = sc.nextInt();
        int nlMilliliters = sc.nextInt();
        int npGramsSalt = sc.nextInt();

        int totalDrink = kBottles * lMilliliters;
        int totalToasts = totalDrink / nlMilliliters;
        int totalLimes = cLimes * dSlices;
        int totalSalt = pGramsSalt / npGramsSalt;

        int minDrink = Math.min(Math.min(totalToasts, totalLimes), totalSalt)/nFriends;
        System.out.println(minDrink);
    }
}
