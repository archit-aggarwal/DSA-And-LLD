import java.util.*;
// https://leetcode.com/problems/subsets/description/

// Time = O(2 ^ N), Space = O(N)
class Solution {
    List<List<Integer>> powerset = new ArrayList<>();

    public void subsets(int[] nums, int idx, List<Integer> subset) {
        if (idx == nums.length) {
            powerset.add(new ArrayList<>(subset)); // deep copy
            return;
        }

        // YES choice
        subset.add(nums[idx]);
        subsets(nums, idx + 1, subset);
        subset.remove(subset.size() - 1); // backtracking

        // NO choice
        subsets(nums, idx + 1, subset);
    }

    public List<List<Integer>> subsets(int[] nums) {
        subsets(nums, 0, new ArrayList<>());
        return powerset;
    }
}