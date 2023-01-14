// Lc 504: https://leetcode.com/problems/base-7/description/
// Time = O(Log7 N), Space = O(1)

class Solution {
    public String convertToBase7(int N) {
        long res = 0, power = 1;

        while (N != 0) {
            int remainder = N % 7;
            res = res + power * remainder;
            N = N / 7;
            power = power * 10;
        }

        return String.valueOf(res);
    }
}