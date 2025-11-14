import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            if (nums[0] == nums[n - 1]) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                System.out.print(nums[n - 1] + " " + nums[0] + " ");

                for (int i = 1; i < n - 1; i++) {
                    System.out.print(nums[i]);
                    if (i < n - 2) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
