import java.util.*;
// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/

// Time = O(N log N), Space = O(N)
class Solution {
    int[] preorder;
    HashMap<Integer, Integer> inorder;

    public TreeNode construct(int preidx, int start, int end) {
        if (start > end)
            return null;

        TreeNode root = new TreeNode(preorder[preidx]);
        int mid = inorder.get(preorder[preidx]);
        int lsize = (mid - start);

        root.left = construct(preidx + 1, start, mid - 1);
        root.right = construct(preidx + 1 + lsize, mid + 1, end);
        return root;
    }

    public TreeNode buildTree(int[] pre, int[] in) {
        inorder = new HashMap<>();
        for (int idx = 0; idx < in.length; idx++) {
            inorder.put(in[idx], idx);
        }

        preorder = pre;
        return construct(0, 0, in.length - 1);
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