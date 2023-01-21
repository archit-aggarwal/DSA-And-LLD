// https://practice.geeksforgeeks.org/problems/factorial5739/1
// Time = O(N), Space = O(N) Recursion Stack

class Solution {
    static long factorial(int N) {
        if (N == 0)
            return 1;
        long sans = factorial(N - 1);
        return (N * sans);
    }

}