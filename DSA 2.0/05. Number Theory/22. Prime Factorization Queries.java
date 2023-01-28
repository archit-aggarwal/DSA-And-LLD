import java.util.*;

// Time = O(n log logn + q logn), Space = O(n)

class Solution {
    public static int[] leastPrimeFactor(int n) {
        int[] vis = new int[n + 1];
        vis[1] = 1;

        for (long i = 2; i <= n; i++) {
            if (vis[(int) i] > 0)
                continue;
            vis[(int) i] = (int) i;

            for (long j = i * i; j <= n; j += i) {
                if (vis[(int) j] == 0)
                    vis[(int) j] = (int) i;
            }
        }
        return vis;
    }

    public static ArrayList<ArrayList<Integer>> primeFactorization(ArrayList<Integer> arr, int q) {
        int[] lpf = leastPrimeFactor(1000005); // precomputation

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int N : arr) {
            ArrayList<Integer> primeFactors = new ArrayList<>();
            while (N != 1) {
                primeFactors.add(lpf[N]);
                N /= lpf[N];
            }
            res.add(primeFactors);
        }
        return res;
    }
}
