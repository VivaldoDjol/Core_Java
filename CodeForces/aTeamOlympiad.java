import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> prog = new ArrayList<>();
        ArrayList<Integer> maths = new ArrayList<>();
        ArrayList<Integer> sports = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int skill = sc.nextInt();
            if (skill == 1) {
                prog.add(i + 1);
            } else if (skill == 2) {
                maths.add(i + 1);
            } else {
                sports.add(i + 1);
            }
        }

        int maxTeams = Math.min(prog.size(), Math.min(maths.size(), sports.size()));

        System.out.println(maxTeams);
        for (int i = 0; i < maxTeams; i++) {
            System.out.println(prog.get(i) + " " + maths.get(i) + " " + sports.get(i));
        }
        sc.close();
    }
}
