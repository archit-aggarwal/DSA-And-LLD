import java.util.*;

// https://leetcode.com/problems/count-primes/description/
// Time = O(n log log n), Space = O(n)
class Solution {
    public int countPrimes(int n) {
        boolean[] vis = new boolean[n + 1];
        Arrays.fill(vis, true);
        int count = 0;
        for (long i = 2; i < n; i++) {
            if (vis[(int) i] == false)
                continue;
            count++;
            for (long j = i * i; j < n; j += i)
                vis[(int) j] = false;
        }

        return count;
    }
}

// Using BitSet: Space Optimization: O(N / 8)
class Solution2 {
    public int countPrimes(int n) {
        if (n <= 2)
            return 0;
        BitSet vis = new BitSet(n + 1);
        vis.set(2, n + 1);

        int count = 0;
        for (long i = 2; i < n; i++) {
            if (vis.get((int) i) == false)
                continue;
            count++;
            for (long j = i * i; j < n; j += i)
                vis.clear((int) j);
        }

        return count;
    }
}
