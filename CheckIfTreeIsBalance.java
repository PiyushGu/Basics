package Trees;

public class Basic {
	
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
		
		System.out.println(IsBalance(head));
	}
	
	//check if tree is balance or not

	public static boolean IsBalance(TreeNode node)
	{
		if(node == null)
			return true;
		int leftHeight = GetHeight(node.left);
		int rightHeight = GetHeight(node.right);
		
		int diff = Math.abs(leftHeight - rightHeight);
		
		if(diff > 1)
		{
			return false;
		}
		
		return IsBalance(node.left)&& IsBalance(node.right);
	}

	public static int GetHeight(TreeNode node)
	{
		if(node == null)
			return 0;
		
		return Math.max(GetHeight(node.left),GetHeight(node.right))+1;
	}
}
