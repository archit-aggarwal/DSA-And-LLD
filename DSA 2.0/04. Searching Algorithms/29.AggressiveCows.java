import java.util.*;

// Submission Links:
// https://www.codingninjas.com/codestudio/problems/aggressive-cows_1082559?leftPanelTab=0

// Leetcode : https://leetcode.com/problems/magnetic-force-between-two-balls/

// Time = O(N * log Range), Space = O(1)
class Solution {
    public static boolean isPossible(ArrayList<Integer> stalls, int minDist, int totalCows) {
        int placedCows = 1, lastIdx = 0;

        for (int currentIdx = 1; currentIdx < stalls.size(); currentIdx++) {
            int dist = stalls.get(currentIdx) - stalls.get(lastIdx);

            if (dist >= minDist) {
                placedCows++;
                lastIdx = currentIdx;
            }
        }

        return (placedCows >= totalCows);
    }

    public static int aggressiveCows(ArrayList<Integer> stalls, int cows) {
        Collections.sort(stalls);
        // To Find Adjacent Distance, Not to apply Binary Search
        int left = 1; // Minimum Possible Adjacent Distance
        int right = stalls.get(stalls.size() - 1) - stalls.get(0);

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isPossible(stalls, mid, cows) == true) {
                left = mid + 1; // maximimize the minimum dist
            } else {
                right = mid - 1;
            }
        }

        return right;
    }
}