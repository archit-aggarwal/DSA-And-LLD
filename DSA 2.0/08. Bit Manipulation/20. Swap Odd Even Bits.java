class Solution {
    public static int swap(int n, int left, int right) {
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

    // Function to swap odd and even bits.
    public static int swapBits(int n) {
        for (int bit = 0; bit < 32; bit = bit + 2) {
            n = swap(n, bit, bit + 1);
        }
        return n;
    }

}