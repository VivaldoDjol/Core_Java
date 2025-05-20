import java.util.*;

class Solution {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // Define the types and their bounds
        String[] types = { "byte", "short", "int", "long" };
        long[] mins = { -128, -32768, -2147483648, -9223372036854775808L };
        long[] maxs = { 127, 32768, 2147483647, 9223372036854775807L };

        while (t-- > 0) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");

                for (int i = 0; i < types.length; i++) {
                    if (x >= mins[i] && x <= maxs[i]) {
                        System.out.println("* " + types[i]);
                    }
                }

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }

        sc.close();
    }
}
