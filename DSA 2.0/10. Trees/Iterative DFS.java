import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

// Preorder, Inorder, Postorder Leetcode Problems

class Solution {
    static class Pair {
        TreeNode root;
        int state = 1; // 1 -> preorder, 2 -> inorder, 3 -> postorder

        Pair(TreeNode root) {
            this.root = root;
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        List<Integer> inorder = new ArrayList<>();
        List<Integer> postorder = new ArrayList<>();

        Stack<Pair> stk = new Stack<>();
        if (root != null)
            stk.push(new Pair(root));

        while (stk.size() > 0) {
            root = stk.peek().root;

            if (stk.peek().state == 1) {
                preorder.add(root.val);
                stk.peek().state++;
                if (root.left != null)
                    stk.push(new Pair(root.left));
            } else if (stk.peek().state == 2) {
                inorder.add(root.val);
                stk.peek().state++;
                if (root.right != null)
                    stk.push(new Pair(root.right));
            } else {
                postorder.add(root.val);
                stk.pop();
            }
        }

        return preorder;
    }
}