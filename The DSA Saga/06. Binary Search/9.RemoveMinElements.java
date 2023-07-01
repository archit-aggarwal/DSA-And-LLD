// https://practice.geeksforgeeks.org/problems/remove-minimum-elements4612/1

// time = O(nlogn) ; space = O(1);

class Solution9 {
    public int findFloor(int[] arr, int target) {
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

    int minRemoval(int arr[], int n) {
        Arrays.sort(arr);

        int minRemovals = n;
        for (int min = 0; min < n; min++) {
            int max = findFloor(arr, 2 * arr[min] + 1);
            int removals = n - (max - min + 1);
            minRemovals = Math.min(removals, minRemovals);
        }

        return minRemovals;
    }
}