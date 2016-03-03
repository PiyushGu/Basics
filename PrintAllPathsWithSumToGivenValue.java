class TreeNode
{
    int data;
    TreeNode left;
    TreeNode right;
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
        
       // System.out.print(GetDepthOfTree(head));
        int[] path = new int[GetDepthOfTree(head)];
        FindSum(head,path,0,5);
    }
    
    public static int GetDepthOfTree(TreeNode node)
    {
        if(node == null)
            return 0;
        
        return Math.max(GetDepthOfTree(node.left),GetDepthOfTree(node.right))+1;
    }
    
    public static void FindSum(TreeNode root,int[] path,int level,int sum)
    {
        if(root == null)
            return;
        
        path[level] = root.data;
        
        int t = 0;
        
        for(int i = level;i >= 0;i--)
        {
            t += path[i];
            if(t == sum)
                printPath(path,i,level);
        }
        
        FindSum(root.left,path,level+1,sum);
        FindSum(root.right,path,level+1,sum);
        
        
            
    }
    
    static public void printPath(int[] path,int start,int end)
    {
        System.out.println("----------------------------------");
        for(int i=start; i<= end; i++)
            System.out.println(path[i]);
        
        System.out.println("----------------------------------");
    }
}
