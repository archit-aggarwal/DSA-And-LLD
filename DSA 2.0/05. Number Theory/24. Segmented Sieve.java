// https://www.spoj.com/problems/PRIME1/

import java.util.*;
import java.io.*;

// Time = O(Q * (R - L) + Root R) ACC, Space = O(R - L)
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
            solve();
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    static List<Long> primesieve(int n) {
        boolean[] vis = new boolean[n + 1];
        Arrays.fill(vis, true);

        List<Long> primes = new ArrayList<>();
        for (long i = 2; i < n; i++) {
            if (vis[(int) i] == false)
                continue;

            primes.add(i);
            for (long j = i * i; j < n; j += i)
                vis[(int) j] = false;
        }

        return primes;
    }

    public static void solve() throws Exception {
        List<Long> primes = primesieve(1000005);

        int t = scn.nextInt();
        while (t-- > 0) {
            long left = scn.nextLong();
            long right = scn.nextLong();

            boolean[] vis = new boolean[(int) (right - left + 1)];
            Arrays.fill(vis, true);

            for (long i : primes) {
                if (i * i > right)
                    break;

                long start = (left / i) * i;
                if (start < left)
                    start += i;
                start = Math.max(start, i * i);

                for (long j = start; j <= right; j += i) {
                    vis[(int) (j - left)] = false;
                }
            }

            for (long i = left; i <= right; i++) {
                if (i >= 2 && vis[(int) (i - left)] == true) {
                    System.out.println(i);
                }
            }
            System.out.println();
        }
    }
}