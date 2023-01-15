// https://www.codingninjas.com/codestudio/problems/reset-in-range_972998?leftPanelTab=1

class Solution {
    public static int resetAllBitsInRange(int N, int L, int R) {
        for (int i = R - 1; i < L; i++) {
            int mask = ~(1 << i);
            N = N & mask;
        }

        return N;
    }
}
