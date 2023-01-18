// https://practice.geeksforgeeks.org/problems/copy-set-bits-in-range0623/1
class Solution {
    static int setSetBit(int x, int y, int l, int r) {
        for (int bit = l - 1; bit <= r - 1; bit++) { // looping on bits [L, R]
            int mask = (1 << bit);
            if ((y & mask) != 0) { // check if y has current set bit
                x = (x | mask); // set the current bit in x
            }
        }
        return x;
    }
}