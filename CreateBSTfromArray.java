class TreeNode
{
    public int data;
    public TreeNode left;
    public TreeNode right;
}

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        
        TreeNode head = CreateBST(arr,0,4);
        System.out.println("Created");
            
        
    }
    
    //Given a sorted (increasing order) array with unique integer elements, write an 
    //algorithm to create a binary search tree with minimal height.
    
    public static TreeNode CreateBST(int[] arr,int start,int end)
    {
       if(start>end)
           return null;
        
        int mid = (start+end)/2;
        TreeNode node = new TreeNode();
        node.data = arr[mid];
        node.left = CreateBST(arr,start,mid-1);
        node.right = CreateBST(arr,mid+1,end);
        
        return node;
    }
    
    
    
}