import java.util.*;

public class Main {
    static boolean canSwapToAbc(String s) {
        if (s.equals("abc")) return true;

        List<Integer> mis = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) != "abc".charAt(i)) {
                mis.add(i);
            }
        }
        return mis.size() == 2 &&
                s.charAt(mis.get(0)) == "abc".charAt(mis.get(1)) &&
                s.charAt(mis.get(1)) == "abc".charAt(mis.get(0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(canSwapToAbc(s) ? "YES" : "NO");
        }
        sc.close();
    }
}
