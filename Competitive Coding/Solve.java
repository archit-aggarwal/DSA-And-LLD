import java.util.*;
import java.io.*;

public class Solve {
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
            List<Long> primes = primesieve(100000);
            int t = in.nextInt();
            while(t-- > 0){
                solve(primes);
            }
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }   

    public static List<Long> primesieve(int n){
        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);
        
        List<Long> res = new ArrayList<>();
        for(long i = 2l; i < n; i++){
            if(prime[(int)i] == false) continue;

            res.add(i);
            for(long j = i*i; j < n; j += i){
                prime[(int)j] = false;
            }
        }
        return res;
    }

    public static void solve(List<Long> primes) throws Exception {
        long l = in.nextLong();
        long r = in.nextLong();

        boolean[] vis = new boolean[(int)(r - l + 1)];

        for(long i: primes){
            long start = (l / i) * i;
            if(start < l) start += i;
            start = Math.max(start, i * i);

            for(long j = start; j <= r; j+=i){
                vis[(int)(j - l)] = true;
            }
        }

        for(int i = 0; i < vis.length; i++){
            if((i + l) >= 2 && vis[i] == false) 
                out.print((i + l) + " ");
        }
        out.println("");
    }
}