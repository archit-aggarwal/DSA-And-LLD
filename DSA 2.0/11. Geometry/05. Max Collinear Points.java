import java.util.*;
// Time = O(N ^ 2), Space = O(N ^ 2) 

class Solution {
    public double getSlope(int[] p1, int[] p2) {
        if (p1[0] == p2[0] && p1[1] == p2[1])
            return Double.NEGATIVE_INFINITY;
        if (p1[0] == p2[0])
            return Double.POSITIVE_INFINITY; // parallel to y axis
        return ((double) p2[1] - p1[1]) / (p2[0] - p1[0]);
    }

    public int maxPoints(int[][] points) {
        if (points.length <= 2)
            return points.length;
        int collinear = 2;

        for (int[] p1 : points) {
            HashMap<Double, Integer> lines = new HashMap<>();
            // Double -> Slope, Integer -> Count of Points

            for (int[] p2 : points) {
                double slope = getSlope(p1, p2);
                lines.put(slope, lines.getOrDefault(slope, 1) + 1);
                collinear = Math.max(collinear, lines.get(slope));
            }
        }

        return collinear;
    }
}