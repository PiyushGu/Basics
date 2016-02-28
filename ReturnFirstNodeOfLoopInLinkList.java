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
			fifth.next = third;
			
			head = NodeAtFrontOfLoop(head);
			
			System.out.println(head.data);
			
			
		}
	
		
		// method if the digits are stored in forward order

		
		public static LinkListNode NodeAtFrontOfLoop(LinkListNode head)
		{
			LinkListNode slower = head,faster = head;
			
			if(head == null) return head;
			
			while(faster !=null && faster.next != null)
			{
				slower = slower.next;
				faster = faster.next.next;
				if(slower == faster)
					break;
			}
			
			if(faster == null || faster.next == null)
				return null;
			
			slower = head;
			
			while(slower!= faster)
			{
				slower = slower.next;
				faster = faster.next;
			}
			
			return slower;
		}
	}
	
	
