import java.util.*;
import java.io.*;

// https://cses.fi/problemset/task/1725/
// Time = O(N * B * 6), Space = O(N * B)
class Solution {
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

    static {
        if (System.getProperty("ONLINE_JUDGE") != null) {
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
            solve();
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static double helper(int n, int sum, double[][] dp) {
        if (n == 0 && sum == 0)
            return 1.0;
        if (n <= 0 || sum <= 0)
            return 0.0;
        if (dp[n][sum] != -1.0)
            return dp[n][sum]; // memoization

        double ans = 0.0;
        for (int d = 1; d <= 6; d++) {
            ans += helper(n - 1, sum - d, dp) * (1.0 / 6.0);
        }
        return dp[n][sum] = ans;
    }

    public static void solve() throws Exception {
        int n = scn.nextInt();
        int a = scn.nextInt();
        int b = scn.nextInt();

        double[][] dp = new double[n + 1][b + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= b; j++) {
                dp[i][j] = -1.0;
            }
        }

        double ans = 0;
        for (int sum = a; sum <= b; sum++) {
            ans += helper(n, sum, dp);
        }
        out.println(String.format("%.6f", ans));
    }
}
