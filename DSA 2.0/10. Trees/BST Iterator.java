//  https://leetcode.com/problems/binary-search-tree-iterator/description/
// Per Call : O(1) Time, O(1) Space Morris Preorder

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class BSTIterator {
    TreeNode root;

    public BSTIterator(TreeNode curr) {
        root = curr;
    }

    public TreeNode floor(TreeNode root) {
        TreeNode ans = root.left;
        while (ans.right != null && ans.right != root)
            ans = ans.right;

        return ans;
    }

    public int next() {
        int ans = -1;
        while (root != null) {
            if (root.left == null) {
                ans = root.val;
                root = root.right;
                break;
            }
            TreeNode floor = floor(root);
            if (floor.right == null) {
                floor.right = root; // thread creation
                root = root.left;
            } else {
                floor.right = null; // thread deletion
                ans = root.val;
                root = root.right;
                break;
            }
        }
        return ans;
    }

    public boolean hasNext() {
        if (root == null)
            return false;
        return true;
    }
}