// https://leetcode.com/problems/range-sum-query-2d-immutable/description/

// Variation HW: https://cses.fi/problemset/task/1652

// Time = O(N ^ 2 + Q), Space = O(1)
class NumMatrix {
    int[][] dp; // Precalculation -> O(N ^ 2)

    public NumMatrix(int[][] dp) {
        this.dp = dp;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i > 0)
                    dp[i][j] += dp[i - 1][j];
                if (j > 0)
                    dp[i][j] += dp[i][j - 1];
                if (i > 0 && j > 0)
                    dp[i][j] -= dp[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int r1, int c1, int r2, int c2) {
        int ans = dp[r2][c2];
        if (c1 > 0)
            ans -= dp[r2][c1 - 1];
        if (r1 > 0)
            ans -= dp[r1 - 1][c2];
        if (r1 > 0 && c1 > 0)
            ans += dp[r1 - 1][c1 - 1];
        return ans;
    }
}