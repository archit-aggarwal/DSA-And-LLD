import java.util.*;
// https://www.interviewbit.com/problems/pairs-with-given-xor/

class Solution {
    public int solve(int[] A, int B) {
        HashSet<Integer> vis = new HashSet<>();
        for (int val : A)
            vis.add(val);

        int pairs = 0;
        for (int val : A) {
            if (vis.contains(val ^ B) == true) {
                pairs++;
            }
        }

        return pairs / 2;
    }
}
