import java.util.*;
import java.io.*;
// https://www.spoj.com/problems/DIVSUM/

// Time = O(NlogN + Q), Space = O(N)
class Main {
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

    static FastReader scn = new FastReader();
    static FastWriter out = new FastWriter();

    public static void main(String[] args) {
        try {
            solve();
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void solve() throws Exception {
        int n = 500000;
        long[] factors = new long[n + 1];

        for (long i = 1; i <= n; i++) {
            for (long j = 2 * i; j <= n; j += i) {
                factors[(int) j] += i;
            }
        }

        int t = scn.nextInt();
        while (t-- > 0) {
            int i = scn.nextInt();
            out.println(factors[i]);
        }
    }
}