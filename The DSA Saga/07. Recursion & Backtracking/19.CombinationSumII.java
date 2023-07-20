// https://leetcode.com/problems/combination-sum-ii/description/

// time = O(2^n) ; space = O(n);

import java.util.*;

class Solution {
    List<List<Integer>> ways;

    public void printWays(int[] coins, int idx, int target, List<Integer> output) {
        if (target < 0)
            return; // negative base case: pruning
        if (idx == coins.length) {
            if (target == 0)
                ways.add(new ArrayList<>(output));
            return;
        }

        // yes
        output.add(coins[idx]);
        printWays(coins, idx + 1, target - coins[idx], output);
        output.remove(output.size() - 1);

        // no
        if (output.size() > 0 && output.get(output.size() - 1) == coins[idx])
            return; // duplicate combinations discarded
        printWays(coins, idx + 1, target, output);
    }

    public List<List<Integer>> combinationSum2(int[] coins, int target) {
        Arrays.sort(coins); // to remove duplicate combinations
        ways = new ArrayList<>();
        printWays(coins, 0, target, new ArrayList<>());
        return ways;
    }
}