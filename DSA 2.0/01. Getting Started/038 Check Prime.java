class Solution {
    static int isPrime(int N) {
        // O(root N)
        if (N == 1)
            return 0;

        // first 2 approaches are
        // i<N and i<=N/2
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0)
                return 0;
        }

        return 1;
    }
}
