// https://leetcode.com/problems/first-bad-version/description/
// Time = O(Log2 N), Space = O(1)

class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid) == false)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return left;
    }
}

// For No Compilation Errors
class VersionControl {
    public boolean isBadVersion(int val) {
        return false;
    }
}