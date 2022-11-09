// https://practice.geeksforgeeks.org/problems/find-transition-point-1587115620/1

// Time = O(log2 N), Space = O(1)

class GfG {
    int transitionPoint(int arr[], int n) {
        if (n == 0 || arr[n - 1] == 0)
            return -1;

        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;
    }
}