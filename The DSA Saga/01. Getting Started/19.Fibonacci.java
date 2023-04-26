// https://leetcode.com/problems/fibonacci-number/description/

class Solution {
    public int fib(int n) {
        if (n <= 1)
            return n;
        int a = 0, b = 1, c = 1;
        for (int i = 2; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        return c;
    }
}