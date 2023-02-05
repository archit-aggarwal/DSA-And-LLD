import java.util.*;
// https://leetcode.com/problems/letter-tile-possibilities/description/
// Subsets + Distinct Permutations
// Time = O(N!), Space = O(N)

class Solution {
    List<String> subsets = new ArrayList<>();

    public void helper(String nums, boolean[] vis, String output) {
        subsets.add(output);
        if (output.length() == nums.length())
            return;

        for (int idx = 0; idx < nums.length(); idx++) {
            if (vis[idx] == true)
                continue;
            if (idx > 0 && vis[idx - 1] == false && nums.charAt(idx) == nums.charAt(idx - 1))
                continue;

            vis[idx] = true;
            helper(nums, vis, output + nums.charAt(idx));
            vis[idx] = false;
        }
    }

    public int numTilePossibilities(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        str = new String(chars);

        helper(str, new boolean[str.length()], "");
        System.out.println(subsets);
        return subsets.size() - 1;
    }
}