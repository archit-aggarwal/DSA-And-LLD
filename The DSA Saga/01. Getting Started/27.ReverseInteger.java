// https://leetcode.com/problems/reverse-integer/

class Solution {
    public int reverse(int n) {
        int res = 0;

        while (n != 0) {
            int digit = n % 10;
            int newres = res * 10 + digit;
            if (newres / 10 != res) {
                // integer overflow
                return 0;
            }
            res = newres;
            n /= 10;
        }

        return res;
    }
}