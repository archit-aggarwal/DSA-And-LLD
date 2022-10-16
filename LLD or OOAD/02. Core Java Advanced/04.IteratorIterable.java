
import java.util.*;

// Single BST Node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }
}

// Collection of Nodes
class BinarySearchTree implements Iterable<Integer> {
    private TreeNode root;

    public void insert(int val) {
        root = insert(root, val);
    }

    private TreeNode insert(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);

        if (val < root.val)
            root.left = insert(root.left, val);

        else if (val > root.val)
            root.right = insert(root.right, val);

        return root;
    }

    @Override
    public Iterator<Integer> iterator() {
        BSTIterator itr = new BSTIterator(root);
        return itr;
    }
}

class BSTIterator implements Iterator<Integer> {
    Stack<TreeNode> stk;

    public BSTIterator(TreeNode root) {
        stk = new Stack<>();
        inorderSucc(root);
    }

    public void inorderSucc(TreeNode curr) {
        while (curr != null) {
            stk.push(curr);
            curr = curr.left;
        }
    }

    @Override
    public Integer next() {
        TreeNode curr = stk.pop();
        inorderSucc(curr.right);
        return curr.val;
    }

    @Override
    public boolean hasNext() {
        return (stk.size() > 0);
    }
}

class IteratorIterable {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(70);
        tree.insert(50);
        tree.insert(90);
        tree.insert(30);
        tree.insert(40);
        tree.insert(80);
        tree.insert(100);

        // Iterable: For Each Loop
        for (Integer data : tree) {
            System.out.print(data + " ");
        }
        System.out.println();

        // Iterator
        Iterator<Integer> itr = tree.iterator();
        while (itr.hasNext() == true) {
            System.out.print(itr.next() + " ");
        }
    }
}
