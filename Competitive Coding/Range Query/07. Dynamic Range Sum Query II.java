// https://leetcode.com/problems/range-sum-query-mutable/description/
// Using Binary Tree Syntax

class Node {
    int sum, low, high;
    Node left, right;

    Node(int low, int high, int sum) {
        this.low = low;
        this.high = high;
        this.sum = sum;
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

        root.sum = root.left.sum + root.right.sum;
        return root;
    }

    static int query(Node root, int low, int high) {
        if (high < root.low || root.high < low)
            return 0; // non overlap
        if (root.low >= low && root.high <= high)
            return root.sum; // completely inside
        return query(root.left, low, high)
                + query(root.right, low, high); // partial overlap
    }

    static void update(Node root, int index, int value) {
        if (root.low == root.high) {
            root.sum = value;
            return;
        }

        int mid = root.low + (root.high - root.low) / 2;
        if (index <= mid)
            update(root.left, index, value);
        else
            update(root.right, index, value);
        root.sum = root.left.sum + root.right.sum;
    }
}

class NumArray {
    Node root;

    public NumArray(int[] nums) {
        root = Tree.build(0, nums.length - 1, nums);
    }

    public void update(int index, int value) {
        Tree.update(root, index, value);
    }

    public int sumRange(int low, int high) {
        return Tree.query(root, low, high);
    }
}