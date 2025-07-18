import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = sc.nextInt();
        int totalFaces = 0;

        for (int i = 0; i < n; i++) {
            String polyHedron = sc.next();
            switch (polyHedron.charAt(0)) {
                case 'T': totalFaces += 4; break;   // Tetrahedron
                case 'C': totalFaces += 6; break;   // Cube
                case 'O': totalFaces += 8; break;   // Octahedron
                case 'D': totalFaces += 12; break;  // Dodecahedron
                case 'I': totalFaces += 20; break;  // Icosahedron
            }
        }

        out.println(totalFaces);
        out.close();
    }

    public static PrintWriter out;

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
}
