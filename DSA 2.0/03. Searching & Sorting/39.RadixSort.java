//  Maximum Gap: https://leetcode.com/problems/maximum-gap/description/
// Leetcode 164
// Time = O(N * 10), Space = O(N)

class Solution {
    public int[] countSort(int[] nums, int place) {
        int[] freq = new int[10];

        // 1. Fill the Frequency Array
        for (int val : nums) {
            int digit = (val / place) % 10;
            freq[digit]++;
        }

        // 2. Convert it to the Suffix Array
        for (int i = freq.length - 2; i >= 0; i--)
            freq[i] += freq[i + 1];

        // 3. Sort
        int[] res = new int[nums.length];

        for (int val : nums) {
            int digit = (val / place) % 10;
            int idx = nums.length - freq[digit];
            freq[digit]--; // next occurence to next index
            res[idx] = val;
        }

        return res;
    }

    public int maximumGap(int[] nums) {
        if (nums.length <= 1)
            return 0;

        // Radix Sort = O(10 * N) = Linear Sorting
        for (int place = 1; place <= 1000000000; place = place * 10) {
            nums = countSort(nums, place);
        }

        int gap = Integer.MIN_VALUE;
        for (int idx = 0; idx < nums.length - 1; idx++) {
            gap = Math.max(gap, nums[idx + 1] - nums[idx]);
        }

        return gap;
    }
}