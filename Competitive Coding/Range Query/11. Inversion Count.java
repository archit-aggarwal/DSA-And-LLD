import java.util.*;
import java.io.*;

// https://www.spoj.com/problems/INVCNT/

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
            int t = scn.nextInt();
            while (t-- > 0)
                solve();
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    static int[] tree = new int[10000007];

    static void update(int index, int val) {
        while (index < tree.length) {
            tree[index] += val;
            index += index & (-index);
        }
    }

    static long query(int index) {
        long sum = 0;
        while (index > 0) {
            sum += tree[index];
            index -= index & (-index);
        }
        return sum;
    }

    public static void solve() throws Exception {
        Arrays.fill(tree, 0);
        int n = scn.nextInt();

        int[] arr = new int[n];
        long ans = 0;

        // Time = O(N log N), Space = O(N) Space
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            ans += i - query(arr[i]);
            update(arr[i], 1);
        }

        out.println(ans);
    }
}
