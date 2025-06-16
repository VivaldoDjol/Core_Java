import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        // Start writing your solution here. -------------------------------------
///***** OPTIMISED TO SEE THE DIFFERENCE
        String n = sc.nextLine();
        int counter = 0;
        for (int i = 0; i < n.length(); i++) {
            char charIndex = n.charAt(i);
            if(charIndex  == '7'|| charIndex == '4'){
                counter++;
            }
        }
        if(counter == 4 || counter == 7) out.println("YES");
        else out.println("NO");

///**********THIS IS NON OPTIMISED
//        String n = sc.nextLine();
//        char[] nToArray = n.toCharArray();
//        int counter = 0;
//        for (int i = 0; i < nToArray.length; i++) {
//            if(nToArray[i] - '0' == 7 || nToArray[i] - '0' == 4){
//                counter++;
//            }
//        }
//        if(counter == 4 || counter == 7) out.println("YES");
//        else out.println("NO");

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
