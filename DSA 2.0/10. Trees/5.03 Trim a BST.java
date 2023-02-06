// https://leetcode.com/problems/trim-a-binary-search-tree/description/

// Time = O(N), Space = O(N)
class Solution {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null)
            return null;
        if (root.val < low)
            return trimBST(root.right, low, high);
        if (root.val > high)
            return trimBST(root.left, low, high);

        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
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