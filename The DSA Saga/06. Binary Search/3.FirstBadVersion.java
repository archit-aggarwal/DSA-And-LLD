// https://leetcode.com/problems/first-bad-version/description/

// time = O(log n) ; space = O(1) ;

import java.util.*;

public class Solution extends VersionControl {
    // APPROACH : 1
    public int firstBadVersion(int n) {
        int left = 1, right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid) == false) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    // APPROACH : 2

    public int firstBadVersion(int n) {
        long left = 1, right = n;

        while (left <= right) {
            long mid = (left + right) / 2;

            if (isBadVersion((int) mid) == false) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return (int) left;
    }

}
