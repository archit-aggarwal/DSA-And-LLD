// https://practice.geeksforgeeks.org/problems/find-first-set-bit-1587115620/1
class Solution {
    public static int log2(int x) {
        return (int) (Math.log(x) / Math.log(2)) + 1;
    }

    public static int approach1(int n) {
        int rsb = Integer.lowestOneBit(n);
        return log2(rsb);
    }

    public static int approach2(int n) {
        for (int bit = 0; bit < 32; bit++) {
            if ((n & (1 << bit)) != 0) {
                return bit + 1;
            }
        }
        return 0;
    }

    public static int getFirstSetBit(int n) {
        if (n == 0)
            return 0;

        int rsb = n & -n;
        return log2(rsb);
    }

}