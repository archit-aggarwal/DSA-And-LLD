// https://leetcode.com/problems/valid-mountain-array/description/

import java.util.*;

class Solution13 {

    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3)
            return false;
        int idx = 0;
        while (idx + 1 < arr.length) {
            if (arr[idx] == arr[idx + 1]) {
                return false;
            } else if (arr[idx] > arr[idx + 1]) {
                break;
            }
            idx++;
        }
        if (idx == 0)
            return false;
        if (idx == arr.length - 1)
            return false;

        while (idx + 1 < arr.length) {
            if (arr[idx] == arr[idx + 1]) {
                return false;
            } else if (arr[idx] < arr[idx + 1]) {
                break;
            }
            idx++;
        }
        return (idx == arr.length - 1);
    }
}
