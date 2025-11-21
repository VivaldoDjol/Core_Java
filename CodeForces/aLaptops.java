import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] laptops = new int[n][2];
        for (int i = 0; i < n; i++) {
            laptops[i][0] = sc.nextInt();
            laptops[i][1] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(laptops, Comparator.comparingInt(a -> a[0]));
        boolean happy = false;

        for (int i = 1; i < n; i++) {
            if (laptops[i][1] < laptops[i - 1][1]) {
                happy = true;
                break;
            }
        }
        System.out.println(happy ? "Happy Alex" : "Poor Alex");
    }
}
