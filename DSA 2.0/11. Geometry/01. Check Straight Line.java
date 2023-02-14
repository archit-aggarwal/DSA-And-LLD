// https://leetcode.com/problems/check-if-it-is-a-straight-line/description/
// Time = O(N), Space = O(1)

class Solution {
    public double getSlope(int[] p1, int[] p2) {
        if (p1[0] == p2[0])
            return Double.POSITIVE_INFINITY; // parallel to y axis
        return ((double) p2[1] - p1[1]) / (p2[0] - p1[0]);
    }

    public boolean checkStraightLine(int[][] pts) {
        double slope = getSlope(pts[0], pts[1]);

        for (int i = 2; i < pts.length; i++) {
            double curr = getSlope(pts[i], pts[0]);
            if (curr != slope)
                return false;
        }

        return true;
    }
}