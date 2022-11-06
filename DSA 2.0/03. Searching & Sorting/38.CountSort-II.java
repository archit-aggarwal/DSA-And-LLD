// https://leetcode.com/problems/sort-an-array/description/
// Time = O(N + K) 
// Space = O(N + K) Not Inplace
// Stable

class Solution {
    public int[] sortArray(int[] nums) {
        int max = 50000, min = -50000; // according to constraint
        int[] freq = new int[max - min + 1];

        // 1. Fill the Frequency Array
        for (int val : nums)
            freq[val - min]++;

        // 2. Convert it to the Suffix Array
        for (int i = freq.length - 2; i >= 0; i--)
            freq[i] += freq[i + 1];

        // 3. Sort
        int[] res = new int[nums.length];

        for (int val : nums) {
            int idx = nums.length - freq[val - min];
            freq[val - min]--; // next occurence to next index
            res[idx] = val;
        }

        return res;
    }
}