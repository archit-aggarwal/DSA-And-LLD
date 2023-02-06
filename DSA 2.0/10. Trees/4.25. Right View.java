import java.util.*;
// https://leetcode.com/problems/binary-tree-right-side-view/description/

// Time = O(N), Space = O(N)
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;

        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        while (q.size() > 0) {
            res.add(q.getLast().val); // rightmost node
            for (int c = q.size(); c > 0; c--) {
                root = q.remove();
                if (root.left != null)
                    q.add(root.left);
                if (root.right != null)
                    q.add(root.right);
            }
        }

        return res;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}