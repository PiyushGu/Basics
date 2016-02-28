package basic1;


public class Basic {

	
	public static void main(String[] args)
	{
		LinkListNode head = new LinkListNode();		
		LinkListNode second = new LinkListNode();
		LinkListNode third = new LinkListNode();
		LinkListNode forth = new LinkListNode();
		LinkListNode fifth = new LinkListNode();
		
		head.data = 10;
		head.next = second;
		
		second.data = 9;
		second.next = third;
		
		third.data = 3;
		third.next = forth;
		
		forth.data = 4;
		forth.next = fifth;
		
		fifth.data = 4;
		fifth.next = null;
		
		head = PartitionLinkList(head,4);
		
		head.PrintLinkList();
		
		
	}
	


	//Method to partition a linked list around a value x, such that all nodes less than x
	//come before all nodes greater than or equal to x

	public static LinkListNode PartitionLinkList(LinkListNode node, int x)
	{
		if(node == null)
			return node;
		
		LinkListNode beforeStart = null;
		LinkListNode beforeEnd= null;
		LinkListNode afterStart = null;
		LinkListNode afterEnd = null;
		
		while(node != null)
		{
			LinkListNode next = node.next;
			node.next = null;
			if(node.data < x)
			{
				if(beforeStart == null)
				{
					beforeStart = node;
					beforeEnd = beforeStart;
				}
				else
				{
					beforeEnd.next = node;
					beforeEnd = node;
				}
			}
			else
			{
				if(afterStart == null)
				{
					afterStart = node;
				    afterEnd = afterStart;
				}
				else
				{
					afterEnd.next = node;
					afterEnd = node;
				}
			}
			
			node = next;
		}
			
			if(beforeStart == null)
			{
				return beforeEnd;
			}
			
			beforeEnd.next = afterStart;
			
			return beforeStart;
		}

}


