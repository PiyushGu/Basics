package basic1;

import java.util.Stack;
	
	
	
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
			
			third.data = 2;
			third.next = forth;
			
			forth.data = 2;
			forth.next = null;
			
			//fifth.data = 2;
			//fifth.next = null;
			
		
			System.out.println(IsPalindrome(head));
			

			System.out.println(IsPalindrome1(head,4).isTrue);
		
		}
	
		//palindrome - recursive way
		static public Result IsPalindrome1(LinkListNode head,int length)
		{
			Result retVal = new Result();
			if(head == null||length == 0)
			{
				retVal.isTrue = true;
				return retVal;
			}
			if(length == 1)
			{
				retVal.isTrue = true;
				retVal.node = head.next;
				return retVal;
			}
			if(length == 2)
			{
				retVal.node = head.next.next;
				retVal.isTrue = head.data == head.next.data;
				return retVal;
			}
			
			retVal = IsPalindrome1(head.next,length-2);
			
			if(retVal == null || !retVal.isTrue|| retVal.node == null)
			{
				return retVal;
			}
			
			retVal.isTrue = retVal.node.data == head.data;
			retVal.node = retVal.node.next;
			return retVal;
			
		}

		//check if link list is Palindrome or not

		static public boolean IsPalindrome(LinkListNode p1)
		{
			if(p1 == null)
				return true;
			
			if(p1.next == null)
				return true;
				
			Stack<Integer> stack = new Stack<Integer>();
			LinkListNode fast = p1;
			LinkListNode slow = p1;
			
			while(fast != null && fast.next != null)
			{
				stack.push(slow.data);
				slow = slow.next;
				fast = fast.next.next;
			}
			
			if(fast!= null)
			{
				slow = slow.next;
			}
			
			while(slow != null)
			{
				int val = stack.pop();
				if(val != slow.data)
					return false;
				slow = slow.next;
				
			}
			return true;
		}
	}
	
	
