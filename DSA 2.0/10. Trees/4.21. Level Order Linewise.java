import java.util.*;
// https://leetcode.com/problems/binary-tree-level-order-traversal/

// Approach 1: Using Counter or Size
// Time = O(N), Space = O(N)
class Solution1 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null)
            return levels;

        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        while (q.size() > 0) {
            List<Integer> level = new ArrayList<>();

            for (int c = q.size(); c > 0; c--) {
                root = q.remove();
                level.add(root.val);

                if (root.left != null)
                    q.add(root.left);
                if (root.right != null)
                    q.add(root.right);
            }

            levels.add(level);
        }

        return levels;
    }
}

// Approach 2: Using Marker Node
// Time = O(N), Space = O(N)
class Solution2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null)
            return levels;

        TreeNode marker = new TreeNode();
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        q.add(marker);
        levels.add(new ArrayList<>());

        while (q.size() > 0) {
            root = q.remove();

            if (root != marker) {
                levels.get(levels.size() - 1).add(root.val);
                if (root.left != null)
                    q.add(root.left);
                if (root.right != null)
                    q.add(root.right);
            } else {
                if (q.size() == 0)
                    break;
                q.add(marker);
                levels.add(new ArrayList<>());
            }
        }

        return levels;
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