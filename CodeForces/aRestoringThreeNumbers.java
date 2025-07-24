import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long [] arr = new long[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);

        long sumAll = arr[3];

        long a = sumAll - arr[0];
        long b = sumAll - arr[1];
        long c = sumAll - arr[2];

        System.out.println(c + " " + b + " " + a);
    }
}
