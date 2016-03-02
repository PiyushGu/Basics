class TreeNode
{
    int data;
    TreeNode right;
    TreeNode left;
}

 class Ancestor
  {
 	boolean isAncestor;
    TreeNode root;
    Ancestor()
    {
    }
    Ancestor(TreeNode root,boolean isAncestor)
    {
      this.isAncestor = isAncestor;
      this.root = root;
    }
  }
public class Main
{
    static public void main(String[] args)
    {
        TreeNode head = new TreeNode();
		head.data = 3;
		
		TreeNode second = new TreeNode();
		second.data = 2;
		
		TreeNode third = new TreeNode();
		third.data = 1;
		
		TreeNode fourth = new TreeNode();
		fourth.data = 4;
		
		
		TreeNode fifth = new TreeNode();
		fifth.data = 5;
		
		head.left = second;
		
		head.right = fourth;
		
		second.left = third;
		
		fourth.right = fifth;
        
        System.out.println(CommonAncestor2(head,second,fourth).root.data);
    }
    
    // find the common ancestor
    
    static public boolean IsCover(TreeNode root, TreeNode n)
    {
        if(n==null || root == null)
            return false;
        
        if(root == n)
            return true;
        
        return IsCover(root.left,n) || IsCover(root.right,n);
    }
    
	// find the first common ancestor of two node in a binary tree
    static public TreeNode CommonAncestor(TreeNode root,TreeNode p,TreeNode q)
    {
        if(root == null)
            return null;
        if(p == root || q== root)
            return root;
        
        boolean isCoverP = IsCover(root.left,p);
        boolean isCoverQ = IsCover(root.left,q);
        
        if(isCoverP != isCoverQ)
            return root;
        
        
        TreeNode next = isCoverP?root.left:root.right;
        
        return CommonAncestor(next,p,q);
            
    }
  
  
 
  
  // 2.find the first common ancestor of two node in a binary tree
    static public Ancestor CommonAncestor2(TreeNode root,TreeNode p,TreeNode q)
    {
      if(root == null)
      {
        Ancestor ancestor = new Ancestor(null,false);
        return (ancestor);
      }
      
      if(root == p && root == q)
        return new Ancestor(root,true);
      
      Ancestor root_left = CommonAncestor2(root.left,p,q);
      
      if(root_left.isAncestor)
        return root_left;
      
      Ancestor root_right = CommonAncestor2(root.right,p,q);
      
      if(root_right.isAncestor)
        return root_right;
      
      if(root_right.root != null && root_left.root != null)
        return new Ancestor(root,true);
      
      if(root == p || root == q)
        return new Ancestor ( root,(root_right.root!=null || root_left.root != null));
      
      return new Ancestor(root_right.root != null? root_right.root : root_left.root ,false);
            
     
    }
        
}