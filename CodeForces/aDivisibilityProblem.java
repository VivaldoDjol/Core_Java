import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        // Start writing your solution here. -------------------------------------
        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = 0;

            if (a % b == 0) {
                out.println(0);
            } else {
                result = b-(a%b);
                out.println(result);
            }
        }


        // Stop writing your solution here. -------------------------------------
        out.close();
    }

    public static void compareIntArrays(int[] arr1, int[] arr2, int[] arr3) {
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = (arr1[i] != arr2[i]) ? 1 : 0;
        }
        for (int num : arr3) {
            out.print(num);
        }
    }
    public static int[] readDigitArray(MyScanner sc) {
        String line = sc.nextLine().trim();
        int[] array = new int[line.length()];
        for (int i = 0; i < line.length(); i++) {
            array[i] = Character.getNumericValue(line.charAt(i));
        }
        return array;
    }

    // PrintWriter for faster output
    public static PrintWriter out;

    // Fast Scanner
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
}
