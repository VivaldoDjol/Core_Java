import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        // Start writing your solution here. -------------------------------------
        int n = sc.nextInt();
        int t = sc.nextInt();

        char[] arr = sc.nextLine().toCharArray();

        while (t-- > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 'B' && i < arr.length - 1 && arr[i + 1] == 'G') {
                    swap(arr, i, i + 1);
                    i++;
                }
            }
        }
        out.println(arr);
        // Stop writing your solution here. -------------------------------------
        out.close();
    }

    public static void swap(char[] arr, int x, int y) {
        char temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
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
