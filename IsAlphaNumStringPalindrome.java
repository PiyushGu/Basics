//Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

public class Main {
    
    public static void main(String[] args)
    {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    
	public static int isPalindrome(String str) {

    if(str == null)
        return 0;
    int len = str.length();
    
    if(len == 1)
        return 1;
        
    StringBuffer sb = new StringBuffer();
    
    for(int i = 0;i<len;i++)
    {
        if((str.charAt(i)>= 'a' && str.charAt(i)<= 'z')|| str.charAt(i) >= 'A' && str.charAt(i)<='Z'
        || str.charAt(i) >= '0' && str.charAt(i) <='9')
            sb.append(Character.toLowerCase(str.charAt(i)));
    }
    
    String alphaNumStr = sb.toString();
    int newLenghth = alphaNumStr.length();
    
    for(int i=0;i< newLenghth/2; i++)
    {
        if(alphaNumStr.charAt(i) != alphaNumStr.charAt(newLenghth-1-i))
            return 0;
    }
    
    return 1;
    
    }
}

