// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/description/
// Same as Koko Eating Bananas

class Solution {
    public boolean isPossible(int[] piles, long speed, long totalHours) {
        long hoursRequired = 0;
        for (int bananas : piles) {
            hoursRequired += bananas / speed; // floor division
            if (bananas % speed != 0)
                hoursRequired++; // ceil division
        }
        return (hoursRequired <= totalHours);
    }

    public long maxInArray(int[] piles) {
        int max = 0;
        for (int bananas : piles)
            max = Math.max(max, bananas);
        return max;
    }

    public int smallestDivisor(int[] piles, int totalHours) {
        long left = 1l, right = maxInArray(piles);
        while (left <= right) {
            long mid = left + (right - left) / 2l;
            if (isPossible(piles, mid, totalHours) == true)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return (int) left;
    }
}