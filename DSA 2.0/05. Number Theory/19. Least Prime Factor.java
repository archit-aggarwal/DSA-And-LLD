// https://practice.geeksforgeeks.org/problems/least-prime-factor5216/1
// Time = O(n log log n), Space = O(n)
class Solution {
    public int[] leastPrimeFactor(int n) {
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

    public int[] highestPrimeFactor(int n) {
        int[] vis = new int[n + 1];
        vis[1] = 1;

        for (long i = 2; i <= n; i++) {
            if (vis[(int) i] > 0)
                continue;
            vis[(int) i] = (int) i;

            for (long j = 2 * i; j <= n; j += i) {
                vis[(int) j] = (int) i;
            }
        }
        return vis;
    }
}