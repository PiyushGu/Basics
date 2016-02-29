import java.util.*;
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
       TreeNode head = new TreeNode();
		head.data = 1;
		
		TreeNode second = new TreeNode();
		second.data = 2;
		
		TreeNode third = new TreeNode();
		third.data = 2;
		
		TreeNode fourth = new TreeNode();
		fourth.data = 1;
		
		
		TreeNode fifth = new TreeNode();
		fifth.data = 1;
		
		head.left = second;
		
		head.right = fourth;
		
		second.left = third;
		
		fourth.right = fifth;
        
        CreateLinkListFromTree(head);
        System.out.println("Created");
            
        
    }
    
    //Given a binary tree, design an algorithm whichcreates a linked list of all the nodes at
    //each depth (e.g., if you have a tree with depth D,you'll have D linked lists).
    
    public static ArrayList<LinkedList<TreeNode>> CreateLinkListFromTree(TreeNode node)
    {
        ArrayList<LinkedList<TreeNode>> list = new ArrayList<LinkedList<TreeNode>>();
        UpdateLinkLists(node,0,list);
        return list;
    }
    public static void UpdateLinkLists(TreeNode node,int level,ArrayList<LinkedList<TreeNode>> lists)
    {
        if(node == null|| lists == null)
            return ;
        
        LinkedList<TreeNode> list = null;
        if(lists.size() == level)
        {
            list = new LinkedList<TreeNode>();
            lists.add(list);
        }
        else
        {
            list = lists.get(level);
        }
        
        list.add(node);
        
        UpdateLinkLists(node.left,level+1,lists);
        UpdateLinkLists(node.right,level+1,lists);
            
    }
    
    
    
}