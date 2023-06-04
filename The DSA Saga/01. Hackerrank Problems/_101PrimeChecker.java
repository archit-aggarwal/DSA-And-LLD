package Day17;

import java.util.*;

public class _101PrimeChecker {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int tests = scn.nextInt();
        while (tests-- > 0) {
            int n = scn.nextInt();
            System.out.println(isPrime2(n));
        }
    }

    public static String isPrime(int n) {
        if (n <= 1)
            return "No";

        for (int factor = 2; factor < n; factor++) {
            if (n % factor == 0)
                return "No";
        }
        return "Yes";
    }

    public static String isPrime2(int n) {
        if (n <= 1)
            return "No";

        int root = (int) Math.sqrt(n);
        for (int factor = 2; factor <= root; factor++) {
            if (n % factor == 0)
                return "No";
        }
        return "Yes";
    }
}
