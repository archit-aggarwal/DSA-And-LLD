// Leetcode 69:
// https://leetcode.com/problems/sqrtx/description/
// Time = O(Log N), Space = O(1)

class Solution {
    public int mySqrt(int n) {
        int left = 1, right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (1l * mid * mid <= n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }
}
