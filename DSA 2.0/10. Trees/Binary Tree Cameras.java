// https://leetcode.com/problems/binary-tree-cameras/description/
// Time = O(N), Space = O(H)
// DFS - Greedy Algorithm

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public static enum State {
        COVERED, CAMERA, NEED;
    }

    int cameras = 0;

    public State dfs(TreeNode root) {
        if (root == null)
            return State.COVERED;

        State ls = dfs(root.left);
        State rs = dfs(root.right);

        if (ls == State.NEED || rs == State.NEED) {
            cameras++;
            return State.CAMERA;
        }

        if (ls == State.COVERED && rs == State.COVERED) {
            return State.NEED;
        }

        return State.COVERED;
    }

    public int minCameraCover(TreeNode root) {
        if (dfs(root) == State.NEED)
            cameras++;
        return cameras;
    }
}