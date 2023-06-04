// https://leetcode.com/problems/n-th-tribonacci-number/description/

// Time complexity: O(N) Space complexity: O(1)

class Solution {
    public int tribonacci(int n) {
        if (n <= 1)
            return n;
        if (n == 2)
            return 1;

        int a = 0, b = 1, c = 1, d = 2;
        for (int i = 3; i < n; i++) {
            a = b;
            b = c;
            c = d;
            d = a + b + c;
        }
        return d;
    }
}