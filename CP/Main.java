import java.util.*;
import java.io.*;

public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
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
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }

    static FastReader in = new FastReader();
    static FastWriter out = new FastWriter();
    static {
        if (System.getProperty("ONLINE_JUDGE") == null) {
            try {
                System.setOut(new PrintStream(
                        new FileOutputStream("output.txt")));
                System.setIn(new FileInputStream("input.txt"));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        try {
            int testCases = in.nextInt();
            while (testCases-- > 0) {
                solve();
            }
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    static class Pair {
        int x, y;

        Pair(int first, int second) {
            this.x = first;
            this.y = second;
        }

        Pair() {
        }
    }

    public static void solve() throws Exception {
        int n = in.nextInt();

        // int[] arr = new int[n];
        // Arrays.fill(arr, -1);

        // for(int idx = 0; idx < n; idx++){
        // out.print(arr[idx] + " ");
        // arr[idx] = in.nextInt();
        // out.print(arr[idx] + " ");
        // }

        // int[][] points = new int[n][2];

        Pair[] points = new Pair[n];

        for (int idx = 0; idx < n; idx++) {
            points[idx] = new Pair();
            points[idx].x = in.nextInt();
            points[idx].y = in.nextInt();

            int ceil = points[idx].x / points[idx].y;
            if (points[idx].x % points[idx].y != 0)
                ceil++;
            out.println(ceil + " ");
        }

        out.println(Integer.MAX_VALUE);
        out.println(Integer.MIN_VALUE);
        out.println(Long.MAX_VALUE);

    }
}