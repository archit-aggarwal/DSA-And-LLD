import java.util.*;
// https://leetcode.com/problems/serialize-and-deserialize-binary-tree/description/

// Time = O(N), Space = O(N)
// Preorder Serialization
class Codec1 {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null)
            return "N";
        String data = Integer.toString(root.val);
        String left = serialize(root.left);
        String right = serialize(root.right);
        return data + "," + left + "," + right;
    }

    int idx = 0;

    public TreeNode deserialize(String[] data) {
        if (data[idx].equals("N")) {
            idx++;
            return null;
        }

        int val = Integer.parseInt(data[idx++]);
        TreeNode root = new TreeNode(val);

        root.left = deserialize(data);
        root.right = deserialize(data);
        return root;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String str) {
        String[] data = str.split(",");
        return deserialize(data);
    }
}

// Time = O(N), Space = O(N)
// Level Order Serialization
class Codec2 {
    public String serialize(TreeNode root) {
        if (root == null)
            return "N";
        LinkedList<TreeNode> q = new LinkedList<>();
        q.add(root);

        StringBuilder str = new StringBuilder();
        while (q.size() > 0) {
            root = q.removeFirst();

            if (root == null) {
                str.append("N,");
                continue;
            }

            str.append(root.val + ",");
            q.addLast(root.left);
            q.addLast(root.right);
        }

        str.deleteCharAt(str.length() - 1); // remove ,
        return str.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("N"))
            return null;

        String[] strs = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(strs[0]));

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        for (int i = 1; i < strs.length; i++) {
            TreeNode parent = q.remove();
            if (!strs[i].equals("N")) {
                TreeNode left = new TreeNode(Integer.parseInt(strs[i]));
                parent.left = left;
                q.add(left);
            }
            if (!strs[++i].equals("N")) {
                TreeNode right = new TreeNode(Integer.parseInt(strs[i]));
                parent.right = right;
                q.add(right);
            }
        }
        return root;
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