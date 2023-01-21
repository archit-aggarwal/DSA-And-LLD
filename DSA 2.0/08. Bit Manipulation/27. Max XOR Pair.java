// https://www.hackerrank.com/challenges/maximizing-xor/problem

class Solution {
    public static int maximizingXor(int l, int r) {
        int lsb = Integer.highestOneBit(l ^ r);
        int res = 0;
        while (lsb != 0) {
            res = (res | lsb);
            lsb = lsb >> 1;
        }
        return res;
    }
}