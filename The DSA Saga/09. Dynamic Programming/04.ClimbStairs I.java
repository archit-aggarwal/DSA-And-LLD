// https://leetcode.com/problems/climbing-stairs/description/

class Solution {
    // APPROACH : 1 == RECURSIVE
    // time = O(2^n); space = O(n);
    public int rec(int src, int dest) {
        // base cases
        if (src > dest)
            return 0; // negative base case
        if (src == dest)
            return 1; // positive base case

        // recursive call : faith
        int x = rec(src + 1, dest);
        int y = rec(src + 2, dest);

        return x + y;
    }

    // APPROACH : 2 == MEMOIZATION
    // time = O(n); space = O(n) {recursion call stack + dp array}
    public int memo(int src, int dest, int[] dp) {
        if (src > dest)
            return 0; // negative base case
        if (src == dest)
            return 1; // positive base case

        if (dp[src] != 0)
            return dp[src];

        int x = memo(src + 1, dest, dp);
        int y = memo(src + 2, dest, dp);

        return dp[src] = x + y;
    }

    // APPROACH : 3 == TABULATION
    // time = O(n) ; space = O(n) {only dp array}
    public int tabu(int dest, int[] dp) {
        dp[dest] = 1;
        dp[dest + 1] = 0;

        for (int idx = dest - 1; idx >= 0; idx--) {
            dp[idx] = dp[idx + 1] + dp[idx + 2];
        }

        return dp[0];
    }

    // APPROACH : 4 == SPACE OPTIMIZATION
    // time = O(n); space = O(1);
    public int opti(int dest) {
        int ptr1 = 1, ptr2 = 1, ptr3 = 0;

        for (int idx = dest - 1; idx >= 0; idx--) {
            ptr1 = ptr2 + ptr3;
            ptr3 = ptr2;
            ptr2 = ptr1;
        }
        return ptr1;
    }

    public int climbStairs(int n) {
        int[] dp = new int[n + 5]; // to avoid index out of bound
        return opti(n);
    }
}