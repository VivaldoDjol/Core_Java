import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            total += nums[i];
        }
        int halfTotal = total / 2;
        Arrays.sort(nums);
        int sum = 0;
        int count = 0;
        for (int i = nums.length-1; sum <= halfTotal; i--) {
            sum += nums[i];
            count++;
        }
        System.out.println(count);
    }
}
