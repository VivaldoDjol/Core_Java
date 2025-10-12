import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> goals = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String team = sc.nextLine();
            goals.put(team, goals.getOrDefault(team, 0) + 1);
        }

        String winner = "";
        int max = -1;
        for (Map.Entry<String, Integer> entry : goals.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                winner = entry.getKey();
            }
        }
        sc.close();
        System.out.println(winner);
    }
}
