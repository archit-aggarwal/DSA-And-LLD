import java.util.*;
// Time = O(N), Space = O(N)

// Problem 1:
// https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
class Solution1 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
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

        Collections.reverse(levels);
        return levels;
    }
}

// Problem 2:
// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
class Solution2 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
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

            if (levels.size() % 2 == 1)
                Collections.reverse(level); // reversing odd levels
            levels.add(level);
        }

        return levels;
    }
}

// Problem 3:
// https://leetcode.com/problems/average-of-levels-in-binary-tree/

class Solution3 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> levels = new ArrayList<>();
        if (root == null)
            return levels;

        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        while (q.size() > 0) {
            double sum = 0, count = q.size();

            for (int c = q.size(); c > 0; c--) {
                root = q.remove();
                sum = sum + root.val;
                if (root.left != null)
                    q.add(root.left);
                if (root.right != null)
                    q.add(root.right);
            }

            levels.add(sum / count);
        }

        return levels;
    }
}

// Problem 4:
// https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/

class Solution4 {
    public int maxLevelSum(TreeNode root) {
        if (root == null)
            return 0;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int level = 1, maxLevel = 1, maxSum = Integer.MIN_VALUE;

        while (q.size() > 0) {
            int sum = 0;

            for (int c = q.size(); c > 0; c--) {
                root = q.remove();
                sum = sum + root.val;
                if (root.left != null)
                    q.add(root.left);
                if (root.right != null)
                    q.add(root.right);
            }

            if (sum > maxSum) {
                maxLevel = level;
                maxSum = sum;
            }
            level++;
        }

        return maxLevel;
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