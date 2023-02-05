import java.util.*;
// Time = O(2 ^ N), Space = O(N)

class Solution {
    List<List<Integer>> subsets = new ArrayList<>();

    public void helper(int[] coins, int idx, int target, List<Integer> subset) {
        if (target < 0)
            return; // pruning
        if (idx == coins.length) {
            if (target == 0)
                subsets.add(new ArrayList<>(subset));
            return;
        }

        // yes choice
        subset.add(coins[idx]);
        helper(coins, idx + 1, target - coins[idx], subset);
        subset.remove(subset.size() - 1); // backtracking

        // no choice
        if (subset.size() > 0 && subset.get(subset.size() - 1) == coins[idx])
            return;
        helper(coins, idx + 1, target, subset);
    }

    public List<List<Integer>> combinationSum2(int[] coins, int target) {
        Arrays.sort(coins);
        helper(coins, 0, target, new ArrayList<>());
        return subsets;
    }
}
