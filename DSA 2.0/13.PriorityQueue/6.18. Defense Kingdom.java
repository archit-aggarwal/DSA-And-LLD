import java.util.*;
// https://leetcode.com/problems/maximum-area-of-a-piece-of-cake-after-horizontal-and-vertical-cuts/description/

// Time = O(H * Log H + W * log W), Space = O(H + W) Extra Space
class Solution {
    public int maxArea(int h, int w, int[] horicuts, int[] vertcuts) {
        List<Integer> x = new ArrayList<>();
        for (int val : horicuts)
            x.add(val);
        x.add(0);
        x.add(h);
        Collections.sort(x);

        long length = 0;
        for (int i = 1; i < x.size(); i++)
            length = Math.max(length, x.get(i) - x.get(i - 1));

        List<Integer> y = new ArrayList<>();
        for (int val : vertcuts)
            y.add(val);
        y.add(0);
        y.add(w);
        Collections.sort(y);

        long breadth = 0;
        for (int i = 1; i < y.size(); i++)
            breadth = Math.max(breadth, y.get(i) - y.get(i - 1));

        long mod = 1000000007;
        long area = (length % mod * breadth % mod) % mod;
        return (int) area;
    }
}