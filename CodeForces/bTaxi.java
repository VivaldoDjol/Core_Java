import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] cnt = new int[5];
        for (int i = 0; i < n; i++) {
            cnt[sc.nextInt()]++;
        }

        sc.close();

        int taxis = cnt[4];
        int pair = Math.min(cnt[3], cnt[1]);

        taxis += cnt[3];
        cnt[1] -= pair;
        taxis += cnt[2] / 2;

        if (cnt[2] % 2 == 1) {
            taxis += 1;
            cnt[1] = Math.max(0, cnt[1] - 2);
        }

        taxis += (cnt[1] + 3) / 4;
        System.out.println(taxis);
    }
}
