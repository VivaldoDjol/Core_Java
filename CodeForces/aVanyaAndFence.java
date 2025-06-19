import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        // Start writing your solution here. -------------------------------------
        int nFriends = sc.nextInt();
        int hFence = sc.nextInt();
        String[] heightFriends = sc.nextLine().trim().split("\\s+"); // the trim gets rid of beginning and ending spaces, and then \\s+ gets the spaces in the middle
        int total = 0;
        int [] heightArray = new int[heightFriends.length];

        for (int i = 0; i < nFriends; i++) {
             heightArray[i] = Integer.parseInt(heightFriends[i]); //convert from String to integers to be able to compare
            if(hFence >= heightArray[i]) {
                total += 1;
            } else {
                total += 2;
            }
        }
        out.println(total);
        // Stop writing your solution here. -------------------------------------
        out.close();
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
