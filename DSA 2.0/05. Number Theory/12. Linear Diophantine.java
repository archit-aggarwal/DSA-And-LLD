// Check Integral Solutions
class Solution {
    static int gcd(int A, int B) {
        if (B == 0)
            return A;
        return gcd(B, A % B);
    }

    static int isPossible(int A, int B, int C) {
        int g = gcd(A, B);
        if (C % g == 0)
            return 1; // solutions exits -> c is multiple of gcd
        else
            return 0; // else no integral solutions
    }
}