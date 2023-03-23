// https://leetcode.com/problems/next-permutation/description/
// Time = O(3N) Linear, Space = O(1) Constant Extra Space

class Solution {
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length, i, j;

        // Step 1: Find Rightmost Dip
        for (i = n - 2; i >= 0; i--)
            if (nums[i] < nums[i + 1])
                break;

        // Step 2: Find Just Greater Value than A[i]
        for (j = n - 1; i >= 0 && j > i; j--)
            if (nums[i] < nums[j])
                break;

        if (i >= 0)
            swap(nums, i, j);

        // Step 3: Reverse the Array after i Index
        for (int l = i + 1, r = n - 1; l < r; l++, r--)
            swap(nums, l, r);
    }
}
