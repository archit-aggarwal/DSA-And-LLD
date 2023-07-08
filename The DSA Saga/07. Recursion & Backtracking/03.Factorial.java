// https://practice.geeksforgeeks.org/problems/factorial5739/1

// time = O(n) ; space = O(n) recursion call stack space

class Solution {
    static long factorial(int n) {
        // base case : 0! = 1
        if (n == 0)
            return 1;
        // recursive call or faith
        long smallAns = factorial(n - 1);
        // remaining work
        long bigAns = smallAns * n;
        return bigAns;
    }

    static long factorialShort(int n) {
        return (n == 0) ? 1 : factorialShort(n - 1) * n;
    }
}