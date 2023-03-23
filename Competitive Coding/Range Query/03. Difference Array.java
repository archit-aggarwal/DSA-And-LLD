// https://www.spoj.com/problems/UPDATEIT/

import java.util.*;
import java.io.*;

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
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int u = scn.nextInt();

            long[] diff = new long[n];

            while (u-- > 0) {
                int l = scn.nextInt();
                int r = scn.nextInt();
                int val = scn.nextInt();

                diff[r] += val;
                if (l > 0)
                    diff[l - 1] -= val;
            }

            for (int i = n - 2; i >= 0; i--)
                diff[i] += diff[i + 1];

            int g = scn.nextInt();
            while (g-- > 0) {
                int idx = scn.nextInt();
                out.println(diff[idx]);
            }
        }
    }
}
