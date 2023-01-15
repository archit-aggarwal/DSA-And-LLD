// https://practice.geeksforgeeks.org/problems/toggle-bits-given-range0952/1

class Solution {
    static int toggleBits(int N, int L, int R) {

        for (int i = L - 1; i <= R - 1; i++) {
            int mask = (1 << i);
            N = N ^ mask;
        }

        return N;
    }
};