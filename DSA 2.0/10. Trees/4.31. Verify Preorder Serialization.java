// https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/description/

// Time = O(N), Space = O(N)
class Solution {
    public boolean isValidSerialization(String preorder) {
        int depth = 1;
        for (String s : preorder.split(",")) {
            if (depth == 0)
                return false;
            if (s.equals("#"))
                depth--;
            else
                depth++;
        }
        return (depth == 0);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}