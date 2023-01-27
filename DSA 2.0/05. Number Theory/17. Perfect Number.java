// https://leetcode.com/problems/perfect-number/description/
// Time = O(root N), Space = O(1)

class Solution {
    public boolean checkPerfectNumber(int N) {
        long sum = 0;
        for (long i = 1; i * i <= N; i++) {
            if (N % i != 0)
                continue;

            sum = sum + i;
            if (i != N / i)
                sum = sum + N / i;
        }

        return (sum - N == N);
    }
}
