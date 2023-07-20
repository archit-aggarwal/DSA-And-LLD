// https://leetcode.com/problems/permutations/

import java.util.*;

// APPROACH : 1

// time = O(n!)  ; space = O(n);

class Solution18 {
    List<List<Integer>> ways;

    public void printPaths(int[] nums, List<Integer> output) {
        if (output.size() == nums.length) {
            ways.add(new ArrayList<>(output)); // deep copy
            return; // positive base case
        }

        for (int idx = 0; idx < nums.length; idx++) {
            if (output.contains(nums[idx]) == true)
                continue; // duplicate items
            output.add(nums[idx]);
            printPaths(nums, output);
            output.remove(output.size() - 1); // backtracking
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        ways = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        printPaths(nums, output);
        return ways;
    }
}

// APPROACH : 2

// time = O(n!) (average) ; space = O(n);

class Solution {
    List<List<Integer>> ways;

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void printPaths(int[] nums, int i) {
        if (i == nums.length) {
            List<Integer> output = new ArrayList<>();
            for (int val : nums)
                output.add(val);
            ways.add(output);
            return;
        }

        for (int j = i; j < nums.length; j++) {
            swap(nums, i, j);
            printPaths(nums, i + 1);
            swap(nums, i, j); // backtracking
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        ways = new ArrayList<>();
        printPaths(nums, 0);
        return ways;
    }
}