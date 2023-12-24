// https://practice.geeksforgeeks.org/problems/count-number-of-hops-1587115620/1

class Solution {
    static long memo(int src, int dest, long[] dp) {
        // time = O(n); space = O(n);

        // base case
        if (src > dest)
            return 0;
        if (src == dest)
            return 1;

        if (dp[src] != 0)
            return dp[src];

        long x = memo(src + 1, dest, dp);
        long y = memo(src + 2, dest, dp);
        long z = memo(src + 3, dest, dp);

        return dp[src] = ((x % 1000000007) + (y % 1000000007) + (z % 1000000007)) % 1000000007;
    }

    static long tabu(int dest, long[] dp) {
        // time = O(n); space = O(n);
        dp[dest] = 1;

        for (int src = dest - 1; src >= 0; src--) {
            dp[src] = ((dp[src + 1] % 1000000007) + (dp[src + 2] % 1000000007) + (dp[src + 3] % 1000000007))
                    % 1000000007;
        }
        return dp[0];
    }

    static long opti(int dest) {
        // time = O(n); space = O(1);
        if (dest == 1)
            return 1;
        long ptr1 = 2, ptr2 = 1, ptr3 = 1, ptr4 = 0;

        for (int idx = dest - 2; idx >= 0; idx--) {
            ptr1 = ((ptr2 % 1000000007) + (ptr3 % 1000000007) + (ptr4 % 1000000007)) % 1000000007;
            ptr4 = ptr3;
            ptr3 = ptr2;
            ptr2 = ptr1;
        }
        return ptr1;
    }

    static long countWays(int n) {
        long[] dp = new long[n + 5];
        return opti(n);
    }

}