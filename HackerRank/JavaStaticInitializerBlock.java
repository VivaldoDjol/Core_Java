import java.util.*;

public class Solution {
    static int breadth, height;
    static boolean isValid = init();

    static boolean init() {
        Scanner sc = new Scanner(System.in);
        breadth = sc.nextInt();
        height = sc.nextInt();
        sc.close();
        if (breadth > 0 && height > 0) return true;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        return false;
    }

    public static void main(String[] args) {
        if (isValid) System.out.println(breadth * height);
    }
}
