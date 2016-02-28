

package basic1;


public class Basic {

	
	public static void main(String[] args)
	{
		LinkListNode head = new LinkListNode();		
		LinkListNode second = new LinkListNode();
		LinkListNode third = new LinkListNode();
		LinkListNode forth = new LinkListNode();
		LinkListNode fifth = new LinkListNode();
		
		head.data = 1;
		head.next = second;
		
		second.data = 2;
		second.next = third;
		
		third.data = 3;
		third.next = forth;
		
		forth.data = 4;
		forth.next = fifth;
		
		fifth.data = 4;
		fifth.next = null;
		
		RemoveFromMiddle(second);
		
		head.PrintLinkList();
		
		
	}
	

	//method to delete a link list nide from middle

	static public void RemoveFromMiddle(LinkListNode node)
	{
		if(node== null || node.next == null) return;
		
		LinkListNode temp = node.next;
		node.data = temp.data;
		node.next = temp.next;

	}
}


