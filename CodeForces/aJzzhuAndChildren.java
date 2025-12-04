import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Queue<int[]> queue = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            int needed = sc.nextInt();
            queue.offer(new int[]{i + 1, needed});
        }
        
        int lastChild = 0;
        
        while (!queue.isEmpty()) {
            int[] child = queue.poll();
            int index = child[0];
            int remaining = child[1];
            
            remaining -= m;
            if (remaining <= 0) {
                lastChild = index;
            } else {
                queue.offer(new int[]{index, remaining});
            }
        }
        System.out.println(lastChild);
        sc.close();
    }
}
