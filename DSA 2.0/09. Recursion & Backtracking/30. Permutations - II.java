import java.util.*;
// https://leetcode.com/problems/permutations-ii/description/

// Time = O(N!), Space = O(N)

class Solution {
    List<List<Integer>> subsets = new ArrayList<>();

    public void helper(int[] nums, boolean[] vis, List<Integer> output) {
        if (output.size() == nums.length) {
            subsets.add(new ArrayList<>(output));
            return;
        }

        for (int idx = 0; idx < nums.length; idx++) {
            if (vis[idx] == true)
                continue;
            if (idx > 0 && vis[idx - 1] == false && nums[idx] == nums[idx - 1])
                continue;

            vis[idx] = true;
            output.add(nums[idx]);

            helper(nums, vis, output);

            vis[idx] = false;
            output.remove(output.size() - 1);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] vis = new boolean[nums.length];
        helper(nums, vis, new ArrayList<>());
        return subsets;
    }
}