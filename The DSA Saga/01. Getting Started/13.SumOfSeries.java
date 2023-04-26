// https://practice.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1

class Solution {
    long sumOfSeries(long N) {
        long sum = 0;

        for (long idx = 1; idx <= N; idx++) {
            sum += (idx * idx * idx);
            // or sum = sum + (idx * idx * idx);
        }

        return sum;
    }
}