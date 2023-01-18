// https://leetcode.com/problems/reverse-bits/description/

class Solution {
    public int swap(int n, int left, int right) {
        int leftmask = (1 << left);
        int rightmask = (1 << right);

        boolean isLeftSet = ((n & leftmask) != 0);
        boolean isRightSet = ((n & rightmask) != 0);

        if (isLeftSet != isRightSet) {
            n = n ^ leftmask;
            n = n ^ rightmask;
        }

        return n;
    }

    public int reverseBits(int n) {
        int left = 0, right = 31;
        while (left <= right) {
            n = swap(n, left, right);
            left++;
            right--;
        }
        return n;
    }
}