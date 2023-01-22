// https://practice.geeksforgeeks.org/problems/gcd-of-array0614/1

class Solution {
    public int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public int gcd(int N, int arr[]) {
        int ans = arr[0];
        for (int i = 1; i < N; i++) {
            ans = gcd(ans, arr[i]);
        }
        return ans;
    }
}