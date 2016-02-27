package basic1;

public class Basic {

	/*method to perform basic string compression using the counts of
	repeated characters. For example, the string aabcccccaaa would become a2blc5a3 */

	public static void main(String[] args)
	{
		String s1 = "aaaaaiabbaaaadi";
		
		
		System.out.println(CompressString(s1));
		
	}

	public static String CompressString(String s1)
	{
	 int count = GetLengthOfCompression(s1);
	 if(count > s1.length())
		return s1;
	  
	  char[] newStr = new char[count];
	  
	  int index = 0;
	  char last = s1.charAt(0);
	  int countNum = 1;
	  for(int i =1; i< s1.length() ; i++)
	  {
			if(s1.charAt(i) == last)
			{
				countNum++;
				
			}
			else
			{
				index = InsertChar(newStr,last,countNum,index);
				last = s1.charAt(i);
				countNum = 1;
			}
	  }
	  
	  InsertChar(newStr,last,countNum,index);
	  
	  return String.valueOf(newStr);
	}
	static public int InsertChar(char[] newStr,char last,int count,int index)
	{
		newStr[index] = last;
		index++;
		char[] valueArr = String.valueOf(count).toCharArray();
		
		for(char x:valueArr)
		{
			newStr[index] = x;
			index++;
		}
		
		return index;
	}

	static public int GetLengthOfCompression(String str)
	{
		int length = 0;
		int count = 1;
		char last = str.charAt(0);
		
		for(int i = 1; i< str.length();i++)
		{
			if(str.charAt(i)== last)
			{	
				count++;
			}
			else
			{
				last = str.charAt(i);
				
				length = length + 1 + String.valueOf(count).length();
				count = 1;
			}
		}
		
		length += 1+ String.valueOf(count).length();
		return length;
	}

}
