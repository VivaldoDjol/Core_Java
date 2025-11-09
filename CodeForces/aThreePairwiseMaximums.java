import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int[] nums = {x, y, z};
            Arrays.sort(nums);

            if (nums[1] == nums[2]) {
                System.out.println("YES");
                System.out.println(nums[0] + " " + nums[0] + " " + nums[2]);
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
