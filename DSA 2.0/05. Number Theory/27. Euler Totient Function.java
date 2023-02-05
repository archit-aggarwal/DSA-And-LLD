// https://practice.geeksforgeeks.org/problems/euler-totient-function4604/1

// Time = O(Root N), Space = O(1)
class Solution {
    static long ETF(long N) {
        long ans = N;

        for (int f = 2; f * f <= N; f++) {
            if (N % f == 0)
                ans = ans - ans / f;
            while (N % f == 0)
                N = N / f;
        }

        if (N != 1)
            ans = ans - ans / N;
        return ans;
    }
}