import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nPlannedTrips = sc.nextInt();
        int mAmountOfTrips = sc.nextInt();
        int aOneTripPrice = sc.nextInt();
        int bPriceOfMTickets = sc.nextInt();

        if(mAmountOfTrips * aOneTripPrice <= bPriceOfMTickets) {
            System.out.println(nPlannedTrips * aOneTripPrice );
        }
        else {
            System.out.println((nPlannedTrips / mAmountOfTrips) * bPriceOfMTickets
                    + Math.min((nPlannedTrips % mAmountOfTrips) * aOneTripPrice, bPriceOfMTickets));
       }
    }
}
