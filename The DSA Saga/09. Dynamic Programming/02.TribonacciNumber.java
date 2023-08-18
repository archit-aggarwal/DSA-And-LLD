// https://leetcode.com/problems/n-th-tribonacci-number/description/

class Solution {
    // APPROACH : 1 ==> RECURSIVE
    // time = O(2^n) ; space = O(n);
    public int rec(int n) {
        // base case
        if (n == 0 || n == 1)
            return n;
        if (n == 2)
            return 1;

        // recursive call
        int ptr1 = rec(n - 1);
        int ptr2 = rec(n - 2);
        int ptr3 = rec(n - 3);

        // remaining work
        int ans = ptr1 + ptr2 + ptr3;

        return ans;
    }

    // APPROACH : 2 ==> MEMOIZATION
    // time = O(n) ; space = O(n);
    public int memo(int n, int[] dp) {
        // base case
        if (n == 0 || n == 1)
            return n;
        if (n == 2)
            return 1;

        if (dp[n] != 0) {
            return dp[n];
        }
        // recursive call
        int ptr1 = memo(n - 1, dp);
        int ptr2 = memo(n - 2, dp);
        int ptr3 = memo(n - 3, dp);

        // remaining work
        int ans = ptr1 + ptr2 + ptr3;
        dp[n] = ans;
        return dp[n];
    }

    // APPROACH : 3 ==> TABULATION
    // time = O(n); space = O(n);
    public int tab(int n, int[] dp) {
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for (int idx = 3; idx <= n; idx++) {
            dp[idx] = dp[idx - 1] + dp[idx - 2] + dp[idx - 3];
        }
        return dp[n];
    }

    // APPROACH : 4 ==> OPTIMIZATION
    // time = O(n) ; space = O(1);
    public int opti(int n) {
        if (n == 0 || n == 1)
            return n;
        if (n == 2)
            return 1;
        int a = 0, b = 1, c = 1, d = 2;

        for (int idx = 3; idx <= n; idx++) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return d;
    }

    public int tribonacci(int n) {
        int[] dp = new int[n + 5]; // to avoid index out of bound
        return opti(n);
    }
}
