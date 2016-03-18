//Write a function to find the longest common prefix string amongst an array of strings.

//Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

//As an example, longest common prefix of "abcdefgh" and "abcefgh" is "abc".

//Given the array of strings, you need to find the longest S which is the prefix of ALL the strings in the array.

import java.util.*;
public class Main {
    
    public static void main(String[] args)
    {
        ArrayList<String> input = new ArrayList<String>();

        input.add("abcdefgh");
        input.add("abfghijk");
        input.add("abcefgh");
        
        System.out.println(longestCommonPrefix(input));
    }
    
	public static String longestCommonPrefix(ArrayList<String> a) {
	    if(a.size() == 0)
	        return "";
	        
	     int minLen = Integer.MAX_VALUE;
	     
	     for(int i=0; i< a.size();i++)
	        {
	            int len = a.get(i).length();
	            if(minLen > len)
	                minLen = len;
	        }
	       
	   StringBuilder sb = new StringBuilder(); 
	   for(int i = 0 ; i < minLen ; i++)
	   {
	       char c = a.get(0).charAt(i);
	       
	       for(int j = 0; j< a.size() ; j++)
	            {
	                if(c != a.get(j).charAt(i))
	                    return sb.toString();
	            }
	        sb.append(c);
	            
	   }
	   
	   return sb.toString();
	}

}

