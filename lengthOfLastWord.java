/*Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.
*/
public class Home {
    
    public static void main(String[] args)
    {
        
        System.out.println(Integer.toString(lenghthOfLastWord("Hello World ")));
    }
    
	public static int lenghthOfLastWord(String str) {
	   
        if(str == null)
            return 0;
        
        //trim spaces
        int len = str.length();
        
        int endIndex = len -1;
        while(endIndex >= 0 && str.charAt(endIndex) == ' ')
        {
        	endIndex --;
        }
        if(endIndex < 0)
            return 0;
        int lastWordIndex = endIndex;
        
        while(lastWordIndex >=0 &&str.charAt(lastWordIndex) != ' ')
        	lastWordIndex --;
        
        return endIndex - lastWordIndex;
	}

}

