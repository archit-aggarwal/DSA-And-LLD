import java.util.*;
import java.io.*;

public class Solution {
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

    static int[] nodes;
    public static void construct(int idx, int left, int right, int[] nums){
        if(left > right) return;
        if(left == right) {
            nodes[idx] = nums[left];
            return;
        }

        int mid = left + (right - left) / 2;
        construct(2 * idx + 1, left, mid, nums);
        construct(2 * idx + 2, mid + 1, right, nums);
        nodes[idx] = Math.min(nodes[2 * idx + 1], nodes[2 * idx + 2]);
    }

    public static int minQuery(int idx, int nl, int nr, int gl, int gr){
        if(nr < gl || gr < nl) return Integer.MAX_VALUE; // no overlap
        if(nl >= gl && nr <= gr) return nodes[idx]; // complete overlap

        int mid = nl + (nr - nl) / 2;
        int left = minQuery(2 * idx + 1, nl, mid, gl, gr);
        int right = minQuery(2 * idx + 2, mid + 1, nr, gl, gr);
        return Math.min(left, right);
    }

    public static void update(int idx, int left, int right, int index, int value){
        if(left == right){
            nodes[idx] = value;
            return;
        }

        int mid = left + (right - left) / 2;

        if(index <= mid) update(2 * idx + 1, left, mid, index, value);
        else update(2 * idx + 2, mid + 1, right, index, value);
        nodes[idx] = Math.min(nodes[2 * idx + 1], nodes[2 * idx + 2]);
    }

    public static void solve() throws Exception {
        int n = scn.nextInt();
        int q = scn.nextInt();

        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = scn.nextInt();
        }

        nodes = new int[4 * n + 5];
        Arrays.fill(nodes, Integer.MAX_VALUE);
        construct(0, 0, n - 1, nums);

        while(q-- > 0){
            int type = scn.nextInt();

            if(type == 1){
                int index = scn.nextInt();
                int value = scn.nextInt();
                update(0, 0, n - 1, index - 1, value);
            } else {
                int left = scn.nextInt();
                int right = scn.nextInt();
                out.println(minQuery(0, 0, n - 1, left - 1, right - 1));
            }
        }
    }   
}

