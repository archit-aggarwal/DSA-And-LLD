// Time = O(N ^ 2), Space = O(N ^ 2)
class Solution {
    int inf = Integer.MIN_VALUE;

    public int helper(int l, int r, int[] nums, int[][] dp) {
        if (l > r)
            return 0;
        if (l == r)
            return nums[l];
        if (dp[l][r] != inf)
            return dp[l][r];

        int first = nums[l] - helper(l + 1, r, nums, dp);
        int last = nums[r] - helper(l, r - 1, nums, dp);
        return dp[l][r] = Math.max(first, last);
    }

    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                dp[i][j] = inf;

        int profit = helper(0, n - 1, nums, dp);
        return (profit >= 0);
    }
}