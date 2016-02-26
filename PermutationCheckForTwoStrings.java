
// method to decideif one isa permutation of theothe

//1. using sorting

public String SortStringByChars(String str)
{
	if(str == null)
		return str;
	
	char[] charArry = str.toCharArray();
	java.util.Arrays.sort(charArry);
	
	return new String(charArry);
}

public boolean IsPermutation1(String s1, String s2)
{
	if(s1.length() != s2.length())
	{
		return false;
	}
	
	return SortStringByChars(s1).equals.SortStringByChars(s2);
} 



//2. Using boolean Array (can also do using HashMap)

public boolean IsPermutation2(String s1, String s2)
{
	if(s1.length() != s2.length())
	{
		return false;
	}
	
	int[] checkers = new int[256];
	
	for(int count = 0 ; count < s1.length(); count++)
	{
		checkers[s1.charAt(count)]++;
	}
	
	for(int count = 0; count <s2.length() ; count++)
	{
		checkers[s2.charAt(count)]--;
		
		if(checkers[s2.charAt(count)] < 0)
				return false;
	}
	
	return true;	
	
}