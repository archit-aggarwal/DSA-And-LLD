import java.util.*;

// Total Time = O(NloglogN + Q)
// Total Space = O(N)

class Solution {
    static List<Integer> primes;

    static void primesieve(int n) {
        boolean[] vis = new boolean[n + 1];
        Arrays.fill(vis, true);

        primes = new ArrayList<>();
        for (long i = 2; i < n; i++) {
            if (vis[(int) i] == false)
                continue;

            primes.add((int) i);
            for (long j = i * i; j < n; j += i)
                vis[(int) j] = false;
        }
    }

    public static int findNthPrime(int n) {
        if (primes == null) {
            primesieve(10000005); // precomputation
        }

        return primes.get(n - 1);
    }
}
