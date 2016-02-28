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
			
			head = AddTwoLinkList(head,head,0);
			
			head.PrintLinkList();
			
			
		}
		
	
	


		//You have two numbers represented by a linked list, where each node contains a
		//single digit. The digits are stored in reverse order, such that the 1 'sdigit is at the head
		//of the list. Write a function that adds the two numbers and returns the sum as a
		//linked list.

		public static LinkListNode AddTwoLinkList(LinkListNode p1,LinkListNode p2, int carry)
		{
			if(p1 == null && p2 == null && carry == 0)
			{
				return null;	
			}
			LinkListNode result = new LinkListNode();
			if(p1 != null)
				result.data += p1.data;
			if(p2 != null)
				result.data += p2.data;
			
			result.data += carry;
			
			if(p1!= null || p2 != null)
			{
				LinkListNode next = new LinkListNode();
				next = AddTwoLinkList(p1 == null? null:p1.next, p2==null?null:p2.next,(result.data >10)?1:0);
				result.data = result.data%10;
				result.next = next;
			}
			return result;
		}
	
	
	
	
// method if the digits are stored in forward order
	
	public static LinkListNode AddTwoLinkList1(LinkListNode p1,LinkListNode p2)
	{
		if(p1 == null && p2 == null)
		{
			return null;
		}
		
		int len1 = GetLength(p1);
		int len2 = GetLength(p2);
		
		if(len1 > len2)
		{
			p2 = PadZeros(p2,len1-len2);
		}
		else if(len1<len2)
		{
			p1 = PadZeros (p1,len2 - len1);
		}
		
		WrapperSum sum = GetSum(p1,p2);
		
		if(sum.carry == 0)
			return sum.sum;
		
		//add carry
		LinkListNode node = new LinkListNode();
		node.data = 1;
		node.next = sum.sum;
		sum.sum = node;
		
		return sum.sum;
	}

	public static WrapperSum GetSum(LinkListNode p1,LinkListNode p2)
	{
		if(p1==null&& p2 == null)
		{
			WrapperSum temp =  new WrapperSum();
			
			return temp;
		}
		
		
		WrapperSum sum = GetSum(p1.next,p2.next);
		
		int value = p1.data + p2.data + sum.carry;
		int carry = value >10 ? 1:0;
		
		LinkListNode node = new LinkListNode();
		node.data = value%10;
		node.next = sum.sum;
		sum.carry = carry;
		sum.sum = node;
		
		return sum;
	}

	public static int GetLength(LinkListNode p1)
	{
		int length = 0;
		
		while(p1!=null)
		{
			p1 = p1.next;
			length++;
		}
		
		return length;
	}
	
	public static LinkListNode PadZeros(LinkListNode p1,int length)
	{
		for(int i=0; i<length ;i++)
		{
			LinkListNode node = new LinkListNode();
			node.data = 0;
			node.next = p1;
			p1 = node;
			
		}
		return p1;
	}
}
}
