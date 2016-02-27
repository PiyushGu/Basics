

//Assume you have a method isSubstring which checks if one word is asubstring
//of another. Given two strings, si and s2, write code to check Ifs2 isa rotation of si
//using only onecalltoisSubstring 
static public boolean IsRotation(String s1,String s2)
{
	int length = s1.length();
	
	if(length == s2.length()&& length > 0)
	{
		String s1s1 = s1+s1;
		
		return isSubString(s1s1,s2);
	}
	
	return false;
}