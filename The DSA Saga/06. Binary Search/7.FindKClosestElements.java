// https://leetcode.com/problems/find-k-closest-elements/description/

// time = O(logn + k) ; space = O(1);

class Solution7 {
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

    public List<Integer> findClosestElements(int[] arr, int k, int target) {
        int floor = floorInArray(arr, target);
        int ceil = floor + 1;

        for (int count = 0; count < k; count++) {
            int floorDist = (floor == -1)
                    ? Integer.MAX_VALUE
                    : (target - arr[floor]);
            int ceilDist = (ceil == arr.length)
                    ? Integer.MAX_VALUE
                    : (arr[ceil] - target);

            if (floorDist <= ceilDist) {
                floor--; // floor closer
            } else {
                ceil++; // ceil closer
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int idx = floor + 1; idx < ceil; idx++) {
            res.add(arr[idx]);
        }
        return res;
    }
}