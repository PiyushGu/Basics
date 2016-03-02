class TreeNode
{
    int data;
    TreeNode right;
    TreeNode left;
    TreeNode parent
}

//Write an algorithm to find the 'next'node (i.e., in-order successor) of a given nodein
//a binary search tree. Youmay assume that each nodehas a link to its parent

public class Main{
    
    public static TreeNode InOrderSuccessor(TreeNode node)
    {
        if(node == null) return null;

        if(node.right!= null)
            return LeftModeChild(node.right);

         else
         {
             TreeNode q = node;
             TreeNode x = node.parent;

             while(x !=null && x.left != q)
             {
                 q = x;
                 x = x.parent
             }

             return x;
         }

        return x;
    }
    
    public static TreeNode LeftMostChild(TreeNode node)
    {
        if(node == null)
            return null;
        
        while(node.left !=null)
        {
            node = node.left;
        }
        
        return node;
        
    }
}