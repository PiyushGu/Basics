class TreeNode
{
    int data;
    TreeNode right;
    TreeNode left;
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
        
        System.out.println(IsBST2(head));
    }
    
    //Implemen t a function to check if a binary tree isa binary search tree.
    
    //using array
    
    static int index = 0;
    static public void UpdateArr(TreeNode node,int[] arr)
    {
        if(node == null)
            return;
        UpdateArr(node.left,arr);
        arr[index] = node.data;
        index++;
        UpdateArr(node.right,arr);
        
    }
    
    static public boolean IsBST1(TreeNode node, int treeSize)
    {
        int[] arr = new int[treeSize];
        
        UpdateArr(node,arr);
        
        for(int i = 1 ; i<arr.length - 1;i++)
        {
            if(arr[i]<arr[i-1])
                         return false;
        }
                          
        return true;
            
    }
    
    
    //using static variable
    static public int val = Integer.MIN_VALUE;
    static public boolean IsBST(TreeNode node)
    {
        if(node == null) return true;
        if(!IsBST(node.left)) return false;
        
        if(node.data < val) return false;
        val = node.data;
        
        if(!IsBST(node.right)) return false;
        
        return true;
        
    }
    
    
    //using min max
    
    static public int min = Integer.MIN_VALUE;
    static public int max = Integer.MAX_VALUE;
        
     static public boolean IsBST2(TreeNode node)
    {
        if(node == null) return true;
        
        return IsBinarySearchTree(node,min,max);
    }
    
    static public boolean IsBinarySearchTree(TreeNode node, int min,int max)
    {
        if(node == null)
               return true;
       
        if(min>=node.data|| node.data > max)
            return false;
        
        if(!IsBinarySearchTree(node.left,min,node.data)||
           !IsBinarySearchTree(node.right,node.data,max))
            return false;
        
        
        return true;
        
    }
}
