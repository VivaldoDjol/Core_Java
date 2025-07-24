import java.util.Scanner;

public class aVasyaTheHipster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int red = sc.nextInt();
        int blue = sc.nextInt();

        int minPairSocks = Math.min(red, blue);
        int remainingRed = red - minPairSocks;
        int remainingBlue = blue - minPairSocks;
        int afterPairSocks = (remainingRed/2) + (remainingBlue/2);
        System.out.println(minPairSocks + " " + afterPairSocks);
    }
}
