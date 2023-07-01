// https://leetcode.com/problems/heaters/description/

// time = O(nlogn) ; space = O(1);

class Solution8 {
    public int floorInArray(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                right = mid - 1;

            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }

    public int findClosest(int[] heaters, int house) {
        int floor = floorInArray(heaters, house);
        int ceil = floor + 1;

        int floorDist = (floor == -1)
                ? Integer.MAX_VALUE
                : (house - heaters[floor]);
        int ceilDist = (ceil == heaters.length)
                ? Integer.MAX_VALUE
                : (heaters[ceil] - house);

        return Math.min(floorDist, ceilDist);
    }

    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters); // closest heater queries

        int minRadius = 0;
        for (int house : houses) {
            int radius = findClosest(heaters, house);
            minRadius = Math.max(minRadius, radius);
        }

        return minRadius;
    }
}