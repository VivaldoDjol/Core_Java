import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        int mCount = 0;
        int cCount = 0;

        for (int i = 0; i < tests; i++) {
            int m = sc.nextInt();
            int c = sc.nextInt();

            if (m > c) mCount++;
            else if (m < c) cCount++;
            else {
                cCount+=0;
                mCount+=0;
            }
        }
        if(mCount > cCount) System.out.println("Mishka");
        else if(mCount < cCount) System.out.println("Chris");
        else System.out.println("Friendship is magic!^^");
    }
}
