import java.util.*;

// Leetcode 658: https://leetcode.com/problems/find-k-closest-elements/description/
// Time = O(LogN + K + KLogK), Space = O(1) Constant Extra Space

class Solution {
    public int lowerBound(int[] nums, int target) {
        // Same as First Occurence
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return left; // if target -> first occ, else ceil
    }

    public List<Integer> findClosestElements(int[] nums, int k, int target) {
        int right = lowerBound(nums, target);
        int left = right - 1;

        List<Integer> res = new ArrayList<>();

        while (left >= 0 && right < nums.length && res.size() < k) {
            if (target - nums[left] <= nums[right] - target) {
                res.add(nums[left]);
                left--;
            } else {
                res.add(nums[right]);
                right++;
            }
        }

        while (left >= 0 && res.size() < k) {
            res.add(nums[left]);
            left--;
        }

        while (right < nums.length && res.size() < k) {
            res.add(nums[right]);
            right++;
        }

        Collections.sort(res);
        return res;
    }
}