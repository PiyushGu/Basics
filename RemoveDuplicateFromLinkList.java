package basic1;

import java.util.HashMap;

public class Basic {

	
	public static void main(String[] args)
	{
		LinkListNode head = new LinkListNode();
		LinkListNode first = new LinkListNode();
		LinkListNode second = new LinkListNode();
		LinkListNode third = new LinkListNode();
		LinkListNode forth = new LinkListNode();
		
		head.data = 2;
		head.next = first;
		
		first.data = 2;
		first.next = second;
		
		second.data = 2;
		second.next = third;
		
		third.data = 2;
		third.next = forth;
		
		forth.data = 2;
		forth.next = null;
		
		//head.PrintLinkList();
		
		RemoveDuplicate1(head);
	
		head.PrintLinkList();
		
	}
	
	//remove duplicate in place
	
		static public void RemoveDuplicate1(LinkListNode head)
		{
			LinkListNode slow = head;
			LinkListNode fast = head;
			LinkListNode previous = null;
			
			while(slow!= null)
			{
				previous = slow;
				fast = slow.next;
				while(fast!= null)
				{
					if(fast.data == slow.data)
					{
						previous.next = fast.next;
					}
					else
					{
						previous = fast;
					}
					fast = fast.next;
				}
				slow = slow.next;
			}
		}

	//using hashMap - remove duplicate from unsorted linked list

	static void removeDuplicate(LinkListNode node)
	{
		LinkListNode previous = null;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		while(node != null)
		{
			if(map.containsKey(node.data))
			{
				previous.next = node.next;
			}
			else
			{
				map.put(node.data,1);
				previous = node;
			}
			
			node = node.next;
		}
	}
}


