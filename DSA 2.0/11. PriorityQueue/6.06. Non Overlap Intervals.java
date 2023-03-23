import java.util.*;
// https://leetcode.com/problems/non-overlapping-intervals/

// Time = O(N Log N), Space = O(1) Constant Extra Space
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (p, q) -> p[0] - q[0]);
        int limit = Integer.MAX_VALUE, removals = 0;

        for (int i = intervals.length - 1; i >= 0; i--) {
            if (intervals[i][1] <= limit) {
                // non onverlapping
                limit = Math.min(limit, intervals[i][0]);
            } else
                removals++;
        }

        return removals;
    }
}
