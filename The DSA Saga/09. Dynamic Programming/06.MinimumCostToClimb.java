// https://leetcode.com/problems/min-cost-climbing-stairs/description/

// time = O(n) and space = O(n);

import java.util.*;

class Solution {
    public int memo(int src, int dest, int [] dp, int[] cost){
        // base case
        if(src > dest) return (int)1e5;
        if(src == dest) return 0;

        if(dp[src] != -1) return dp[src];

        // recursive calls
        int x = memo(src + 1, dest, dp, cost);
        int y = memo(src + 2, dest, dp, cost);

        return Math.min(x, y)
    }
    public int minCostClimbingStairs(int[] cost) {
        int [] dp =  new int [cost.length + 5];
        Arrays.fill(dp, -1);

        int str0 = memo(0, cost.length, dp, cost);
        int str1 = memo(1, cost.length, dp, cost);

        return Math.min(str0, str1);
    }
}