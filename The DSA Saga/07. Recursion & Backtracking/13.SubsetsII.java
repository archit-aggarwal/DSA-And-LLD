// https://leetcode.com/problems/subsets-ii/description/

// time = O(2^n) ; space = O(n);

import java.util.*;

class Solution13 {
    List<List<Integer>> result;

    public void printSubsets(int[] input, int idx, List<Integer> output) {
        // base case
        if (idx == input.length) {
            // result.add(output); // shallow copy
            result.add(new ArrayList<>(output)); // deep copy
            return;
        }

        // yes call
        output.add(input[idx]); // insert
        printSubsets(input, idx + 1, output);
        output.remove(output.size() - 1); // backtracking (remove)

        // no call
        if (output.size() > 0 && output.get(output.size() - 1) == input[idx])
            return; // yes -> no on duplicates will be restricted
        printSubsets(input, idx + 1, output);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        result = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        printSubsets(nums, 0, output);
        return result;
    }
}