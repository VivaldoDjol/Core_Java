import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        // Start writing your solution here. -------------------------------------
        int nGames = sc.nextInt();
        String wonGames = sc.next();
        char wonGamesIndex;
        int counterA = 0;
        int counterD = 0;
        for (int i = 0; i < nGames; i++) {
            wonGamesIndex = wonGames.charAt(i);

            if(wonGamesIndex == 'A') counterA++;
            else if(wonGamesIndex == 'D') counterD++;
        }

        if(counterA > counterD) out.println("Anton");
        else if (counterA < counterD) out.println("Danik");
        else out.println("Friendship");

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
