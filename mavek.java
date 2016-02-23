/*
 * Complete the function below.
 */

    static int reverseSumIntegers(int input1, int input2) {

     int ans = reverseInt(input1) + reverseInt(input2);
        
        return reverseInt(ans);
    }
    
    static int reverseInt(int input)
        {
            int num = 0;
            while (input != 0)
            {
             num = num * 10 + input % 10;
            input = input / 10;   
            }
        return num;
    }

	
	/*
 * Complete the function below.
 */

    static String findMostFrequentChar(String inputString) {

        
        Map<Character,Integer> hashMap = new HashMap<Character,Integer>();
        
        for (int i = 0; i < inputString.length(); i++)
        {
            char c = inputString.charAt(i);  
            if(hashMap.containsKey(c))
                {
                int v = hashMap.get(c);
                hashMap.put(c,v + 1);
            }
            else
                {
                
                hashMap.put(c,1);
            }
                
    
        }
        
       Iterator<Character> it = hashMap.keySet().iterator();
        int max = -1;
        char returnValue = ' ';
        while(it.hasNext())
            {
            char next = it.next();
            if(max <= hashMap.get(next))
               {
                  returnValue = next;
                  max = hashMap.get(next);
               }
        }
        
        return String.valueOf(returnValue);
    }


	
	/*
 * Complete the function below.
 */
/*
For your reference:
LinkedListNode {
    int val;
    LinkedListNode *next;
};
*/

    static LinkedListNode removeElems(int value, LinkedListNode head) {
        
        if(head == null)
                return null;
        LinkedListNode current = head;
        while(current != null && current.val == value)
                    {
                    head = head.next;
                    current = head;
                }
        while(current.next != null)
            {
            if(current.next.val == value)
                {
                
                   current.next = current.next.next;
               // current = current.next;
            }
            else
                {
                current = current.next;
            }
        }
        
        
        return head;

    }


	
	select d.dept_name, e.salary from dept d, emp e where d.dept_id = e.dept_id  group by dept_name having max(e.salary) 
	
	
select tm.cn from (
select max(t.sc), t.cn as cn from
    (select count(*) as sc,customerNumber cn from orders group by customerNumber ORDER BY count(*) desc) t) tm
	
	