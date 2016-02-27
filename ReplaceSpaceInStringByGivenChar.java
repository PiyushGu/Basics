
//method to replace all spaces in a string with '%20'.

public static void main(String[] args)
	{
		String s1 = "Hello World!!How are you?";
		
		System.out.println(s1);
		System.out.println(ReplaceSpace(s1));
		
	}
	public static String ReplaceSpace(String s1)
	{
		if(s1 == null) return s1;
		
		int spaces =0;
		//count number of spaces
		for(int count=0; count< s1.length(); count++)
		{
			if(s1.charAt(count) == ' ')
				spaces++;
		}
		
		if(spaces == 0) return s1;
		
		char[] charArray = new char[s1.length() + spaces*2];
		
		int charCounter = 0;
		
		for(int i = 0 ; i< s1.length(); i++)
		{
			if(s1.charAt(i) == ' ')
			{
				charArray[charCounter++] = '2';
				charArray[charCounter++] = '0';
				charArray[charCounter++] = '%';
			}
			else
			{
				charArray[charCounter++] = s1.charAt(i);
			}
		}
		
		return new String(charArray);
		
	}
	
	
//replacing spaces in place

public static void ReplaceSpace1(char[] str,int length)
	{
		//count num of spaces
		int spaceCount = 0;
		for(int i = 0 ; i<length ; i++)
		{
			if(str[i]== ' ')
				spaceCount++;
		}
		
		if(spaceCount == 0) return;
		
		int newLength = length + spaceCount*2;
		
		str[newLength] = '\0';
		
		for(int i = length -1; i>= 0; i--)
		{
			if(str[i] == ' ')
			{
				str[--newLength] = '%';
				str[--newLength] = '0';
				str[--newLength] = '2';
			}
			else
			{
				str[--newLength] = str[i];
			}
		}
	
	}