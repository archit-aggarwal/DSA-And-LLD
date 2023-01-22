// https://practice.geeksforgeeks.org/problems/lcm-and-gcd4516/1
// Time = O(log N), Space = O(log N) Recursive

class Solution {
    static Long GCD(Long A, Long B) {
        if (B == 0)
            return A;
        return GCD(B, A % B);
    }

    static Long[] lcmAndGcd(Long A, Long B) {
        Long HCF = GCD(A, B);
        Long LCM = (A * B) / HCF;
        return new Long[] { LCM, HCF };
    }
};