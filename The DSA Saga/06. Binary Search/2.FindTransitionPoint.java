// https://practice.geeksforgeeks.org/problems/find-transition-point-1587115620/1

// time = O(log n) ; space = O(1);

import java.util.*;

class Solution2 {
    int transitionPoint(int arr[], int n) {
        if (arr[n - 1] == 0)
            return -1;
        // no 1s in entire array -> no transition point

        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}