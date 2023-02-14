// https://leetcode.com/problems/largest-triangle-area/description/

// Time = O(N ^ 3), Space = O(1)
class Solution {
    public double getArea(int[] p1, int[] p2, int[] p3) {
        return Math.abs(0.5 * (p1[0] * (p2[1] - p3[1])
                + p2[0] * (p3[1] - p1[1]) + p3[0] * (p1[1] - p2[1])));
    }

    public double largestTriangleArea(int[][] points) {
        double max = 0;

        for (int[] p1 : points)
            for (int[] p2 : points)
                for (int[] p3 : points)
                    max = Math.max(max, getArea(p1, p2, p3));

        return max;
    }
}
