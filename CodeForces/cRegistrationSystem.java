import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<String, Integer> names = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();

            if (!names.containsKey(name)) {
                System.out.println("OK");
                names.put(name, i);
            } else {
                int count = names.get(name) + 1;
                names.put(name, count);
                System.out.println(name + count);
            }
        }
        sc.close();
    }
}
