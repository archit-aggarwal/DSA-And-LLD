// https://leetcode.com/problems/combination-sum/description/

// time = O(2^n) ; space = O(n) ;

import java.util.*;

class Solution20 {
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
        printWays(coins, idx, target - coins[idx], output);
        output.remove(output.size() - 1);

        // no
        printWays(coins, idx + 1, target, output);
    }

    public List<List<Integer>> combinationSum(int[] coins, int target) {
        ways = new ArrayList<>();
        printWays(coins, 0, target, new ArrayList<>());
        return ways;
    }

}
