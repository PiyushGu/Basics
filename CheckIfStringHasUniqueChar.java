
//Method to check if a string has all unique characters.

//Way 1 - using Hashmap
public boolean HasUniqueCharaters(String str)
{
	HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	char[] characters = str.toCharArray();
	
	for(int counter = 0; counter < str.length(); counter ++)
	{
		if(map.containsKey(characters[counter]))
		{
			return false;
		}
		else
		{
			map.put(characters[counter],1);
		}
	}
	
	return true;
}

//way 2 - using boolean array
public boolean HasUniqueCharacters2(String str)
{
	if(str.length() > 256) return false;
	
	boolean[] char_set = new boolean[256];
	
	for(int counter =0 ; counter < str.length() ; counter++)
	{	
		int value = str.charAt(counter);
		
		if(char_set[value])
			return false;
		
		char_set[value] = true;
	}
	
	return true;
}

//way 3 - using bit value check 
public boolean HasUniqueCharacters3(String str)
{
	if(str.length() > 256) return false;
	
	int check = 0;
	
	for(int counter = 0; counter < str.length(); counter++)
	{
		int value  = str.charAt(counter)-'a';
		
		if((check & 1<<value) > 0)
			return false;
		
		check = check | 1<<value;
	}
	
	return true;
}

