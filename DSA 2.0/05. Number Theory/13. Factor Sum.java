// https://practice.geeksforgeeks.org/problems/factors-sum2016/1

// Time = O(root N), Space = O(1)
class Solution {
    public long factorSum(int N) {
        long sum = 0;
        for (long i = 1; i * i <= N; i++) {
            if (N % i != 0)
                continue;

            sum = sum + i;
            if (i != N / i)
                sum = sum + N / i;
        }

        return sum;
    }
}