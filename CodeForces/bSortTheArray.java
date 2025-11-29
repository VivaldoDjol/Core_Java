import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int[] b = a.clone();
        Arrays.sort(b);
        
        int L = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                L = i;
                break;
            }
        }
        
        if (L == -1) {
            System.out.println("yes");
            System.out.println("1 1");
            sc.close();
            return;
        }
        
        int R = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] != b[i]) {
                R = i;
                break;
            }
        }
        
       boolean ok = true;
        for (int i = L, j = R; i <= R; i++, j--) {
            if (a[i] != b[j]) {
                ok = false;
                break;
            }
        }
        
        if (ok) {
            System.out.println("yes");
            System.out.println((L + 1) + " " + (R + 1));
        } else {
            System.out.println("no");
        }
        sc.close();
    }
}
