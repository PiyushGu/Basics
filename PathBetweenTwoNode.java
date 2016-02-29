//Given a directed graph, design an algorithm to find out whether there is a route
//between two nodes.

import java.util.*;

class TreeNode {
	public int data;
	public TreeNode right;
	public TreeNode left;
}
public class Main {
	
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
        
        System.out.println(IsPath(head,third,second));
        System.out.println(IsPath(head,third,new TreeNode()));
	}
            
    static public boolean IsPath(TreeNode root,TreeNode start,TreeNode end)
    {
	if(root == null)
		return false;
	LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
	
	queue.add(root);
	
	while(!queue.isEmpty())
	{
		TreeNode node = queue.pop();
		
		if(node == end)
			return true;
        if(node.left != null)
		    queue.add(node.left);
		if(node.right != null)
            queue.add(node.right);
		
	}
	return false;
    }
}
