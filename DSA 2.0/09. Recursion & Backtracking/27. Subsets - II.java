import java.util.*;

// https://leetcode.com/problems/subsets-ii/description/
// Time = O(2 ^ N), Space = O(N) 

class Solution {
    List<List<Integer>> subsets = new ArrayList<>();

    public void helper(int[] nums, int idx, List<Integer> subset) {
        if (idx == nums.length) {
            subsets.add(new ArrayList<>(subset)); // deep copy
            return;
        }

        // yes choice
        subset.add(nums[idx]);
        helper(nums, idx + 1, subset);
        subset.remove(subset.size() - 1); // backtracking

        // no choice
        if (subset.size() > 0 && subset.get(subset.size() - 1) == nums[idx])
            return;
        helper(nums, idx + 1, subset);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        helper(nums, 0, new ArrayList<>());
        return subsets;
    }
}
