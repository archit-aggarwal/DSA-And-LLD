// https://leetcode.com/problems/delete-node-in-a-bst/description/

// Time = O(log N), Space = O(log N)
class Solution {
    public int findPredecessor(TreeNode root) {
        // left subtree's maximum value or just smaller
        TreeNode curr = root.left;
        while (curr.right != null)
            curr = curr.right;
        return curr.val;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return null;
        if (key < root.val)
            root.left = deleteNode(root.left, key);
        else if (key > root.val)
            root.right = deleteNode(root.right, key);
        else {
            if (root.right == null)
                return root.left; // only left child
            if (root.left == null)
                return root.right; // only right child
            root.val = findPredecessor(root);
            root.left = deleteNode(root.left, root.val);
        }
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