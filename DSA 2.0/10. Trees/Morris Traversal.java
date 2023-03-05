import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

// Time = O(N), Space = O(1) NO EXTRA SPACE

class Solution {
    public TreeNode floor(TreeNode root) {
        TreeNode ans = root.left;
        while (ans.right != null && ans.right != root)
            ans = ans.right;

        return ans;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        List<Integer> inorder = new ArrayList<>();

        while (root != null) {
            if (root.left == null) {
                preorder.add(root.val);
                inorder.add(root.val);
                root = root.right;
                continue;
            }

            TreeNode floor = floor(root);
            if (floor.right == null) {
                floor.right = root; // thread creation
                preorder.add(root.val);
                root = root.left;
            } else {
                floor.right = null; // thread deletion
                inorder.add(root.val);
                root = root.right;
            }
        }

        return preorder;
    }
}