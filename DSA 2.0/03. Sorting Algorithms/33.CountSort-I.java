// Non-Stable Version

// Time = O(N + K)
// Where K = Range = MaxM Value - MinM Value

// Space = O(N + K)
// Extra Space = Frequency Array = Not Inplace

class Solution {
    public int[] sortArray(int[] nums) {
        int max = 50000, min = -50000; // according to constraint

        // 1. Fill the Frequency Array From Input Unsorted Array
        int[] freq = new int[max - min + 1];
        for (int val : nums)
            freq[val - min]++;

        // 2. Form the Sorted Result From Frequency Array
        int[] res = new int[nums.length];

        int idx = 0;
        for (int actualIdx = 0; actualIdx < freq.length; actualIdx++) {
            int val = actualIdx + min;
            for (int count = 0; count < freq[actualIdx]; count++) {
                res[idx++] = val;
            }
        }

        return res;
    }
}