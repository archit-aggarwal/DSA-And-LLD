package Day17;

import java.util.*;

public class _102PrimeFactorization {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        primeFactorization(n);
    }

    public static void primeFactorization(int n) {
        for (int k = 2; k <= n; k++) {
            if (n % k == 0)
                System.out.println(k);
            while (n % k == 0)
                n /= k;
        }
    }
    // public static void primeFactorization(int n) {
    // for (int k = 2; k <= n; k++) {
    // if (n % k == 0 && isPrime(k) == true) {
    // System.out.println(k);
    // }
    // }
    // }

    // public static boolean isPrime(int k) {
    // if (k <= 1)
    // return false;

    // int root = (int) Math.sqrt(k);
    // for (int factor = 2; factor <= root; factor++) {
    // if (k % factor == 0)
    // return false;
    // }
    // return true;
    // }
}
