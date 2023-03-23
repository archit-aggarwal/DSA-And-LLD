import java.util.*;
// https://leetcode.com/problems/largest-number/description/
// Time = O(N * Log N * L), Space = O(N) Extra Space 

class Solution {
    public static class LargerComp implements Comparator<String> {
        public int compare(String a, String b) {
            return (b + a).compareTo(a + b);
        }
    }

    public String largestNumber(int[] nums) {
        ArrayList<String> arr = new ArrayList<>();
        for (int val : nums)
            arr.add(Integer.toString(val));
        Collections.sort(arr, new LargerComp());

        StringBuilder res = new StringBuilder();
        for (String s : arr)
            res.append(s);
        if (res.charAt(0) == '0')
            return "0";
        return res.toString();
    }
}