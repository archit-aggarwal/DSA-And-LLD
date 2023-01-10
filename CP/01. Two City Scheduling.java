import java.util.*;

// https://leetcode.com/problems/two-city-scheduling/description/
// Time = O(N * Log N), Space = O(1)

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a, b) -> (b[1] - b[0]) - (a[1] - a[0]));

        int total = 0;
        for (int idx = 0; idx < costs.length / 2; idx++)
            total += costs[idx][0];
        for (int idx = costs.length / 2; idx < costs.length; idx++)
            total += costs[idx][1];

        return total;
    }
}