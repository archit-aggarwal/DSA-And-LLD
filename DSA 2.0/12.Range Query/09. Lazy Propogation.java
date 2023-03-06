class Node {
    int sum, low, high, lazy = 0;
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

        propogate(root);
        if (root.low >= low && root.high <= high)
            return root.sum; // completely inside

        return query(root.left, low, high)
                + query(root.right, low, high); // partial overlap
    }

    static void update(Node root, int low, int high, int value) {
        if (high < root.low || root.high < low)
            return;

        if (root.low >= low && root.high <= high) {
            root.lazy += value;
            return;
        }

        propogate(root);
        update(root.left, low, high, value);
        update(root.right, low, high, value);
        root.sum = root.left.sum + root.right.sum;
    }

    static void propogate(Node root) {
        if (root == null || root.lazy == 0)
            return;
        root.sum += root.lazy * (root.high - root.low + 1);

        if (root.low != root.high) {
            if (root.left != null)
                root.left.lazy += root.lazy;
            if (root.right != null)
                root.right.lazy += root.lazy;
        }
        root.lazy = 0;
    }
}

class NumArray {
    Node root;

    NumArray(int[] nums) {
        root = Tree.build(0, nums.length - 1, nums);
    }

    public void update(int low, int high, int value) {
        Tree.update(root, low - 1, high - 1, value);
    }

    public long rangeSum(int low, int high) {
        return Tree.query(root, low - 1, high - 1);
    }

}