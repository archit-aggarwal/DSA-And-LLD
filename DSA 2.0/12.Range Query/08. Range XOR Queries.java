// https://leetcode.com/problems/xor-queries-of-a-subarray/description/

class Node {
    int xor, low, high;
    Node left, right;

    Node(int low, int high, int xor) {
        this.low = low;
        this.high = high;
        this.xor = xor;
    }
}

class Tree {
    static Node build(int low, int high, int[] nums) {
        if (low > high)
            return new Node(low, high, 0);
        if (low == high)
            return new Node(low, high, nums[low]);

        Node root = new Node(low, high, 0);
        int mid = low + (high - low) / 2;

        root.left = build(low, mid, nums);
        root.right = build(mid + 1, high, nums);

        root.xor = root.left.xor ^ root.right.xor;
        return root;
    }

    static int query(Node root, int low, int high) {
        if (high < root.low || root.high < low)
            return 0; // non overlap
        if (root.low >= low && root.high <= high)
            return root.xor; // completely inside
        return query(root.left, low, high)
                ^ query(root.right, low, high); // partial overlap
    }
}

class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        Node root = Tree.build(0, arr.length - 1, arr);

        int[] res = new int[queries.length];
        for (int i = 0; i < res.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            res[i] = Tree.query(root, left, right);
        }

        return res;
    }
}