// https://practice.geeksforgeeks.org/problems/the-nth-fibonnaci3150/1
// Time = O(60), Space = O(1)

class Solution {
    static int twoptr(int n) {
        if (n <= 1)
            return n;
        int a = 0, b = 1, c = 1;

        for (int i = 2; i < n; i++) {
            a = b;
            b = c;
            c = (a + b) % 10;
        }
        return c;
    }

    static int fib(int N) {
        N = N % 60;
        return twoptr(N) % 10;
    }
}