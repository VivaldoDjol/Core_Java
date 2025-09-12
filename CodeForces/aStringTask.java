import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        char[] arr = s.toCharArray();
        List<String> list = new ArrayList<>();
        for (char c : arr) {
            list.add(String.valueOf(c));
        }
        list.removeIf(vowels -> Arrays.asList("a", "e", "i", "o", "u","y").contains(vowels));

        String result = "." + String.join(".", list);
        System.out.println(result);
    }
}
