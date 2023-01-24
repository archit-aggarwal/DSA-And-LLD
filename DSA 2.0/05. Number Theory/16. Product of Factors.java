// https://practice.geeksforgeeks.org/problems/product-of-factors-of-number4757/1

class Solution {
    int m = 1000000007;

    long multiplyFactors(int N) {
        long res = 1;
        for (long i = 1; i * i <= N; i++) {
            if (N % i != 0)
                continue;

            res = (res * i) % m;
            if (i != N / i)
                res = (res * (N / i)) % m;
        }

        return res;
    }

    int factorProduct(int N) {
        return (int) multiplyFactors(N);
    }
}