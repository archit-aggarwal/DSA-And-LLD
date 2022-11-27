// https://practice.geeksforgeeks.org/problems/prime-number2314/1

class Solution {
    // O(N)
    static int approach1(int N) {
        if (N <= 1)
            return 0;

        for (int factor = 2; factor < N; factor++) {
            if (N % factor == 0)
                return 0; // composite
        }
        return 1; // prime
    }

    // O(N/2)
    static int approach2(int N) {
        if (N <= 1)
            return 0;
        if (N <= 3)
            return 1;

        for (int factor = 2; factor <= N / 2; factor++) {
            if (N % factor == 0)
                return 0; // composite
        }
        return 1; // prime
    }

    // O(Root N)
    static int isPrime(int N) {
        if (N <= 1)
            return 0;
        if (N <= 3)
            return 1;

        for (int factor = 2; factor * factor <= N; factor++) {
            if (N % factor == 0)
                return 0; // composite
        }
        return 1; // prime
    }
}