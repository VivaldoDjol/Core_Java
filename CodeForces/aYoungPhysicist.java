import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumA = 0, sumB = 0, sumC = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            sumA += a;
            sumB += b;
            sumC += c;
        }
        if(sumA == 0 && sumB == 0 && sumC == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
