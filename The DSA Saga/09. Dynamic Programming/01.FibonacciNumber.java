// https://leetcode.com/problems/fibonacci-number/

class Solution {
    // APPROACH:1 ==> RECURSIVE
    // time = O(2^n) ; space = O(n);

    public int rec(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        int fib1 = rec(n - 1);
        int fib2 = rec(n - 2);

        return fib1 + fib2;
    }

    // APPROACH : 2 ==> MEMOIZATION
    // time = O(n) ; space = O(n);

    public int memo(int n, int[] dp) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        if (dp[n] != 0)
            return dp[n];

        int fib1 = memo(n - 1, dp);
        int fib2 = memo(n - 2, dp);

        dp[n] = fib1 + fib2;
        return dp[n];
    }

    // APPROACH : 3 ==> TABULATION
    // time = O(n); space = O(n);

    public int tabu(int n, int[] dp) {
        dp[0] = 0;
        dp[1] = 1;

        for (int idx = 2; idx <= n; idx++) {
            dp[idx] = dp[idx - 1] + dp[idx - 2];
        }

        return dp[n];
    }

    public int opti(int n) {
        if (n == 0 || n == 1)
            return n;
        int ptr1 = 0, ptr2 = 1, ptr3 = 1;

        for (int idx = 1; idx < n; idx++) {
            ptr3 = ptr1 + ptr2;
            ptr1 = ptr2;
            ptr2 = ptr3;
        }

        return ptr3;
    }

    // APPROACH : 4 ==> OPTIMIZATION
    // time = O(n) ; space = O(1);

    public int fib(int n) {
        int[] dp = new int[n + 5]; // to avoid index out of bound error
        return opti(n);
    }
}