// https://leetcode.com/problems/valid-boomerang/description/
// Time = O(1), Space = O(1)

class Solution {
    public double getSlope(int[] p1, int[] p2) {
        if (p1[0] == p2[0] && p1[1] == p2[1])
            return Double.NEGATIVE_INFINITY;
        if (p1[0] == p2[0])
            return Double.POSITIVE_INFINITY; // parallel to y axis
        return ((double) p2[1] - p1[1]) / (p2[0] - p1[0]);
    }

    public boolean isBoomerang(int[][] points) {
        double s1 = getSlope(points[0], points[1]);
        double s2 = getSlope(points[1], points[2]);

        if (s1 == Double.NEGATIVE_INFINITY || s2 == Double.NEGATIVE_INFINITY)
            return false;

        if (s1 == s2)
            return false;
        return true; // distinct and different slope
    }
}
