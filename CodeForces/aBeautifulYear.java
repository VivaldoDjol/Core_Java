import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        // Start writing your solution here. -------------------------------------
        String word = sc.nextLine();
        int num = Integer.parseInt(word);
        num++;

        while (true) {
            char[] wordArray = String.valueOf(num).toCharArray();
            int[] freq = new int[10]; // To store digit frequencies (0-9)
            boolean hasDuplicate = false;

            for (char c : wordArray) {
                int digit = c - '0';
                freq[digit]++;
                if (freq[digit] > 1) {
                    hasDuplicate = true;
                    break;
                }
            }

            if (!hasDuplicate) {
                out.print(num);
                break;
            } else {
                num++;
            }
        }
        // Stop writing your solution here. -------------------------------------
        out.close();
    }

    // (MyScanner and PrintWriter classes remain the same)
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
    //-------------------------------------------------------
}
