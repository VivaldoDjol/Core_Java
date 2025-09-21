import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            for (int i = 0; i < 5; i++) {
                arr[0]++;
                Arrays.sort(arr);
            }
            long result = (long) arr[0] * arr[1] * arr[2];
            System.out.println(result);
        }
        sc.close();
    }
}
