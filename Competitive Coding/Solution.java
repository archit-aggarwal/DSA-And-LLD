import java.util.*;
import java.io.*;

public class Solution {
    // static class FastReader {
    //     BufferedReader br;
    //     StringTokenizer st;

    //     public FastReader() {
    //         br = new BufferedReader(
    //             new InputStreamReader(System.in));
    //     }

    //     String next() {
    //         while (st == null || !st.hasMoreElements()) {
    //             try {
    //                 st = new StringTokenizer(br.readLine());
    //             } catch (IOException e) {
    //                 e.printStackTrace();
    //             }
    //         }
    //         return st.nextToken();
    //     }

    //     int nextInt() {
    //         return Integer.parseInt(next());
    //     }

    //     long nextLong() {
    //         return Long.parseLong(next());
    //     }

    //     double nextDouble() {
    //         return Double.parseDouble(next());
    //     }

    //     String nextLine() {
    //         String str = "";
    //         try {
    //             if (st.hasMoreTokens()) {
    //                 str = st.nextToken("\n");
    //             } else {
    //                 str = br.readLine();
    //             }
    //         } catch (IOException e) {
    //             e.printStackTrace();
    //         }
    //         return str;
    //     }
    // }

    // static class FastWriter {
    //     private final BufferedWriter bw;

    //     public FastWriter() {
    //         this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
    //     }

    //     public void print(Object object) throws IOException {
    //         bw.append("" + object);
    //     }

    //     public void println(Object object) throws IOException {
    //         print(object);
    //         bw.append("\n");
    //     }

    //     public void close() throws IOException {
    //         bw.close();
    //     }
    // }

    // static FastReader scn = new FastReader();
    // static FastWriter out = new FastWriter();

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
            // out.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }   

    
    public static long cat(int n, long[] dp){
        if(n == 0 || n == 1) return dp[n] = 1;
        if(dp[n] != -1) return dp[n];
        
        long ans = 0, m = 1908;
        for(int i=0; i<n; i++){
            ans = (ans + (cat(i, dp) * cat(n - 1 - i, dp)) % m) % m;
        }
        
        return dp[n] = ans;
    }

    public static void solve() throws Exception {
        long[] dp = new long[1001];
        Arrays.fill(dp, -1);
        cat(1000, dp);

        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            int n = scn.nextInt();
            System.out.println(dp[n]);
        }
    }   
}

