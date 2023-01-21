// https://leetcode.com/problems/fibonacci-number/description/

class Solution {
    // Time  = O(N), Space = O(1)
    public int iterative(int n) {
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

    // Time = O(2 ^ N), Space = O(N)
    public int fib(int n) {
        if (n <= 1)
            return n;
        int a = fib(n - 1);
        int b = fib(n - 2);
        return a + b;
    }
}