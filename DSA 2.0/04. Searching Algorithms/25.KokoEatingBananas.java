// Leetcode 875: https://leetcode.com/problems/koko-eating-bananas/description/
// Time = O(N * Max) => TLE, Space = O(1)
class LinearSearch {
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

    public int minEatingSpeed(int[] piles, int totalHours) {
        long max = maxInArray(piles);

        for (long speed = 1l; speed <= max; speed++) {
            if (isPossible(piles, speed, totalHours) == true)
                return (int) speed;
        }
        return (int) max;
    }
}

// Binary Search on Answer:
// Time = O(N * Log Max) => Accepted, Space = O(1)
class BinarySearch {
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

    public int minEatingSpeed(int[] piles, int totalHours) {
        long left = 1l;
        long right = maxInArray(piles);

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