// Worst Case: O(log N), Searching, Deletion .. O(log N)

class Solution
{
    public Node rrrotation(Node root){
        Node x = root, y = root.right;
        
        x.right = y.left;
        y.left = x;
        
        balanceFactor(x);
        balanceFactor(y);
        
        return y;
    }
    
    public Node llrotation(Node root){
        Node x = root, y = root.left;
        
        x.left = y.right;
        y.right = x;
        
        balanceFactor(x);
        balanceFactor(y);
        
        return y;
    }
    
    public Node lrrotation(Node root){
        root.left = rrrotation(root.left);
        return llrotation(root);
    }
    
    public Node rlrotation(Node root){
        root.right = llrotation(root.right);
        return rrrotation(root);
    }
    
    public int balanceFactor(Node root){
        if(root == null) return 0;
        
        int lh = (root.left == null) ? 0 : root.left.height;
        int rh = (root.right == null) ? 0 : root.right.height;
        
        root.height = Math.max(lh, rh) + 1;
        return lh - rh;
    }
    
    public Node insertToAVL(Node root,int target)
    {
        if(root == null) return new Node(target);
        if(root.data == target) return root;
        
        if(target < root.data) 
            root.left = insertToAVL(root.left, target);
        else root.right = insertToAVL(root.right, target);
        
        int bf = balanceFactor(root);
        
        if(bf < -1)
        {
            // right skewed
            if(target > root.right.data)
                return rrrotation(root);
            else return rlrotation(root);
        }
        else if(bf > 1)
        {
            // left skewed
            if(target < root.left.data)
                return llrotation(root);
            else return lrrotation(root);
        }
        
        return root;
    }
}