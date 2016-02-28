package basic1;


public class Basic {

	
	public static void main(String[] args)
	{
		LinkListNode head = new LinkListNode();
		LinkListNode first = new LinkListNode();
		LinkListNode second = new LinkListNode();
		LinkListNode third = new LinkListNode();
		LinkListNode forth = new LinkListNode();
		
		head.data = 1;
		head.next = first;
		
		first.data = 2;
		first.next = second;
		
		second.data = 3;
		second.next = third;
		
		third.data = 4;
		third.next = forth;
		
		forth.data = 5;
		forth.next = null;
		
		System.out.println(GetKthToLastNode(head,3).data);
	
		
		
	}
	
	static public LinkListNode GetKthToLastNode(LinkListNode head,int k)
	{
		if(head == null) return null;
		
		LinkListNode fast = head;
		int count = k;
		
		while(count > 0 && fast != null)
		{
			fast = fast.next;
			count--;
		}
		
		if(fast == null) return null;
		
		LinkListNode current = head;
		while(fast!= null)
		{
			current = current.next;
			fast = fast.next;
		}
		
		return current;
	}
}


