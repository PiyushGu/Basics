class TreeNode
{
    int data;
    TreeNode left;
    TreeNode right;
}

public class Main
{
    //You have two very large binary trees: Tl, with millions of nodes, and T2, with
    //hundreds of nodes. Create an algorithm to decideifT2 isa subtree ofTl.
    public static boolean IsSubTree(TreeNode p, TreeNode q)
    {
        if(p == null )
            return false;
        
        if(p.data == q.data)
            if(IsMatch(p,q)) return true;
            
        return IsSubTree(p.left,q)|| IsSubTree(p.right,q);
    }
    
    public static boolean IsMatch(TreeNode p, TreeNode q)
    {
        if(p == null && q== null)
            return true;
        if(p==null || q==null)
            return false;
        
        if(p.data != q.data)
            return false;
        
        return IsMatch(p.left,q.left) && IsMatch(p.right,q.right);
    }
}