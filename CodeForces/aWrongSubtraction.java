import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        // Start writing your solution here. -------------------------------------
        int n = sc.nextInt();
        int k = sc.nextInt();

        while (k-- > 0) {
            if (n % 10 != 0) {
                n--;
            } else {
                n /= 10;
            }
        }

        out.println(n);
//        String number = sc.next();
//        int k = sc.nextInt();
//
//        for (int i = 0; i < k; i++) {
//            char[] digits = number.toCharArray();
//            int len = digits.length;
//            if (digits[len - 1] != '0') {
//                digits[len - 1]--;
//                number = new String(digits);
//            } else {
//                number = number.substring(0, len - 1);
//            }
//        }
//        out.println(number);

        // Stop writing your solution here. -------------------------------------
        out.close();
    }
    public static int[] convertIntToIntegerArray(int n){
        char[] charDigits = String.valueOf(n).toCharArray();

        // Convert chars to ints
        int[] digits = new int[charDigits.length];
        for (int i = 0; i < charDigits.length; i++) {
            digits[i] = charDigits[i] - '0'; //Convert from ASCII to True Number '0' == 48;
        }
        return digits;
    }

    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;

    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
    //--------------------------------------------------------
}
