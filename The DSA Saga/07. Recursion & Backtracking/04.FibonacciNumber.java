// https://leetcode.com/problems/fibonacci-number/description/

// time = O(2^n) ; space = O(n);

class Solution4 {
    public int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        int prev1 = fib(n - 1);
        int prev2 = fib(n - 2);

        int curr = prev1 + prev2;
        return curr;
    }

    public int fibShort(int n) {
        return (n <= 1) ? n : fibShort(n - 1) + fibShort(n - 2);
    }
}