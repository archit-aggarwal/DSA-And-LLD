class Solution {

    boolean isPrime(int n) {

        if (n == 1)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    // O(N Root N) => N = 10^5
    ArrayList<Integer> primeRange(int lo, int hi) {
        // code here

        ArrayList<Integer> res = new ArrayList<>();

        for (int j = lo; j <= hi; j++) {
            if (isPrime(j) == true)
                res.add(j);
        }

        return res;
    }
}
