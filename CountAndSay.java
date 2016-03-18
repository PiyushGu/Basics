
//The count-and-say sequence is the sequence of integers beginning as follows:/
//1, 11, 21, 1211, 111221, ...
//1 is read off as one 1 or 11.
//11 is read off as two 1s or 21.

//21 is read off as one 2, then one 1 or 1211.

//Given an integer n, generate the nth sequence.

//Note: The sequence of integers will be represented as a string.
public class Home {
	public static void main(String[] args)
	{	
		Home h = new Home();
		System.out.println(h.countAndSay(1));
		System.out.println(h.countAndSay(2));
		System.out.println(h.countAndSay(3));
		System.out.println(h.countAndSay(4));
		
		
	}
	
	
		public String countAndSay(int a) {
		    
		    if(a <= 0)
		        return null;
		    
		    String num = "1";
		    
		    while(a-1> 0)
		    {
		        
		        num = generateSequence(num);
		        
		        a--;
		    }
		    
		    return num;
		}
		
		public String generateSequence(String num)
		{
		    int n = num.length();
			   int count = 1;
			   
			   if(num ==" ")
			        return null;
			   
			   if(n == 1)
			        return num + Integer.toString(count);
			    
			    char currentNum = num.charAt(0);
			    // char currentNum = '1';  
			    StringBuilder sb = new StringBuilder();
			    
			     
			    for(int i = 1; i< n; i++)
			    {
			     if(num.charAt(i) == currentNum)
			        count++;
			      else
			        {
			    	  	sb.append(count);
			            sb.append(currentNum);
			            
			            currentNum = num.charAt(i);
			            count=1;
			        }
			    }
			    if(num.charAt(n-1) == currentNum)
			    {   
			    	sb.append(count);
			        sb.append(currentNum);
			    	
			    }
			    return sb.toString();
		}
	

}
