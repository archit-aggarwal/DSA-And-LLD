import java.util.*;

class BruteForce {
    // O(Root N)
    public boolean isPrime(int k) {
        if (k == 0 || k == 1)
            return false;
        if (k == 2 || k == 3)
            return true;

        for (int f = 2; f * f <= k; f++) {
            if (k % f == 0)
                return false;
        }
        return true;
    }

    // O(N * ROOT N)
    public int countPrimes(int n) {
        int count = 0;
        for (int k = 2; k < n; k++) {
            if (isPrime(k) == true)
                count++;
        }
        return count;
    }
}

// Sieve of Eratosthenes
// Time = O(N Log Log N) = O(N), Space = O(N) Boolean Array
class Solution {
    public int countPrimes(int n) {
        if (n <= 2)
            return 0;

        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        int count = 0;
        for (long i = 2l; i < n; i++) {
            if (prime[(int) i] == false)
                continue;
            // if i is itself composite, multiples already rejected

            count++;
            for (long j = i * i; j < n; j += i) {
                prime[(int) j] = false;
                // rejecting multiples of prime = i
            }
        }

        return count;
    }
}