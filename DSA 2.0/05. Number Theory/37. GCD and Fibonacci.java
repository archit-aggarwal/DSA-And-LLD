// https://practice.geeksforgeeks.org/problems/gcd-and-fibonacci-numbers4351/1

// Time = O(log(M, N)), Space = O(1)

class Solution {
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static int fibGcd(int M, int N) {
        int g = gcd(M, N);

        int a = 1, b = 1, c = 1;
        for (int i = 2; i < g; i++) {
            a = b;
            b = c;
            c = (a + b) % 100;
        }
        return c;
    }
}
