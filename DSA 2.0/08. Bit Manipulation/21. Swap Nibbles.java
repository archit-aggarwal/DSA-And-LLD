// https://practice.geeksforgeeks.org/problems/swap-two-nibbles-in-a-byte0446/1

class Solution {
    static int swap(int n, int left, int right) {
        int leftmask = (1 << left);
        int rightmask = (1 << right);

        boolean isLeftSet = ((n & leftmask) != 0);
        boolean isRightSet = ((n & rightmask) != 0);

        if (isLeftSet != isRightSet) {
            n = n ^ leftmask;
            n = n ^ rightmask;
        }

        return n;
    }

    static int swapNibbles(int N) {
        N = swap(N, 0, 4);
        N = swap(N, 1, 5);
        N = swap(N, 2, 6);
        N = swap(N, 3, 7);
        return N;
    }
}