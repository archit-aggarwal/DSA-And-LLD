// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/

// Time complexity: O(N) Space complexity: O(1)

import java.util.*;

class Solution12 {
    public int maxProduct(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;

        for (int idx = 0; idx < nums.length; idx++) {
            if (nums[idx] >= largest) {
                secondlargest = largest;
                largest = nums[idx];
            } else if (nums[idx] > secondlargest) {
                secondlargest = nums[idx];
            }
            if (nums[idx] <= smallest) {
                secondsmallest = smallest;
                smallest = nums[idx];
            } else if (nums[idx] < secondsmallest) {
                secondsmallest = nums[idx];
            }

        }
        int choice1 = (largest - 1) * (secondlargest - 1);
        int choice2 = (smallest - 1) * (secondsmallest - 1);
        return Math.max(choice1, choice2);
    }
}