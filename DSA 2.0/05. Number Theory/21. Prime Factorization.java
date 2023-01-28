import java.util.*;

// Time = O(N), Space = O(1)
class Solution1 {
    public int[] AllPrimeFactors(int N) {
        ArrayList<Integer> primes = new ArrayList<>();

        for (int f = 2; f <= N; f++) {
            if (N % f == 0)
                primes.add(f);
            while (N % f == 0) {
                N = N / f;
            }
        }

        int[] res = new int[primes.size()];
        for (int i = 0; i < res.length; i++)
            res[i] = primes.get(i);
        return res;
    }

}

// Time = O(root N), Space = O(1)
class Solution2 {
    public int[] AllPrimeFactors(int N) {
        ArrayList<Integer> primes = new ArrayList<>();

        for (int f = 2; f * f <= N; f++) {
            if (N % f == 0)
                primes.add(f);
            while (N % f == 0) {
                N = N / f;
            }
        }
        if (N != 1)
            primes.add(N);

        int[] res = new int[primes.size()];
        for (int i = 0; i < res.length; i++)
            res[i] = primes.get(i);
        return res;
    }

}