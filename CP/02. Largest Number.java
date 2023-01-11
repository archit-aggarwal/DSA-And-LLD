import java.util.*;
// https://leetcode.com/problems/largest-number/description/

class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for (int idx = 0; idx < nums.length; idx++) {
            arr[idx] = Integer.toString(nums[idx]);
        }

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder res = new StringBuilder();
        for (String str : arr)
            res.append(str);

        if (res.charAt(0) == '0')
            return "0";
        return res.toString();
    }
}