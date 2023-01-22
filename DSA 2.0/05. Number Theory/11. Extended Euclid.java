// https://practice.geeksforgeeks.org/problems/extended-euclidean-algorithm3848/1

class Solution {
    // ans[0] = gcd, ans[1] = x, ans[2] = y

    static int[] gcd(int a, int b) {
        if (b == 0)
            return new int[] { a, 1, 0 };

        int[] ans = gcd(b, a % b);
        long newX = ans[2];
        long newY = ans[1] - ((long) a / b) * ans[2];

        ans[1] = (int) newX;
        ans[2] = (int) newY;
        return ans;
    }
}