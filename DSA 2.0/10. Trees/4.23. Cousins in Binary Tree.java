import java.util.*;
// https://leetcode.com/problems/cousins-in-binary-tree/

// Time = O(N), Space = O(N)
class Solution {
    public static class Pair {
        TreeNode curr, parent;
        int level;

        Pair(TreeNode curr, TreeNode parent, int level) {
            this.curr = curr;
            this.parent = parent;
            this.level = level;
        }
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        Pair ansx = null, ansy = null;

        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(root, null, 1));

        while (q.size() > 0) {
            Pair p = q.remove();

            if (p.curr.val == x)
                ansx = p;
            if (p.curr.val == y)
                ansy = p;

            if (p.curr.left != null)
                q.add(new Pair(p.curr.left, p.curr, p.level + 1));

            if (p.curr.right != null)
                q.add(new Pair(p.curr.right, p.curr, p.level + 1));
        }

        return (ansx.level == ansy.level) && (ansx.parent != ansy.parent);
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