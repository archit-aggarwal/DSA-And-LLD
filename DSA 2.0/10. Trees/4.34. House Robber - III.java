// https://leetcode.com/problems/house-robber-iii/description/

// Time = O(N), Space = O(N)
class Solution {
    static class Pair {
        int yes, no;
    }

    Pair dfs(TreeNode root) {
        if (root == null)
            return new Pair();
        Pair lans = dfs(root.left);
        Pair rans = dfs(root.right);

        Pair ans = new Pair();
        ans.yes = root.val + lans.no + rans.no;
        ans.no = Math.max(lans.yes, lans.no) + Math.max(rans.yes, rans.no);
        return ans;
    }

    public int rob(TreeNode root) {
        Pair ans = dfs(root);
        return Math.max(ans.yes, ans.no);
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