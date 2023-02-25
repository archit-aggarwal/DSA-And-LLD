// https://leetcode.com/problems/range-sum-query-immutable/description/
// TIme = O(N + Q)

class NumArray {
    int[] prefix;

    public NumArray(int[] nums) {
        this.prefix = nums;
        for (int i = 1; i < nums.length; i++)
            prefix[i] += prefix[i - 1];
    }

    public int sumRange(int left, int right) {
        if (left == 0)
            return prefix[right];
        return prefix[right] - prefix[left - 1];
    }
}