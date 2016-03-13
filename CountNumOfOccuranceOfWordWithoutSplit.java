import java.util.*;

// count occurrence of each word in a string, where the words   are separated by space. split() is not allowed. 

public class Main
{
    public static void main(String[]  args)
    {
        String str = "I am i ab piyush";
        
        HashMap<String,Integer> map =CountNumOfOccurance(str);
        
        for(Map.Entry<String,Integer> entry: map.entrySet())
        {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }
        
        
    }
    
    public static HashMap<String,Integer> CountNumOfOccurance(String str)
    {
        StringBuilder wordArr = new StringBuilder();
        
        String word = " ";
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        if(str == null) return null;
        
        for(int i = 0; i< str.length();i++)
        {
            Character charAti = Character.toLowerCase(str.charAt(i));           
            if(charAti == ' ')
            {
               word = wordArr.toString();
               wordArr.setLength(0);
                
               if(word != " ")
                {
                    if(map.containsKey(word))
                    {
                        map.put(word,map.get(word)+1);
                    }
                    else
                    {
                        map.put(word,1);
                    }
                }
            }
            
            else
            {
                wordArr.append(charAti);
            }
            
            
        }
        
        word = wordArr.toString();
        if(word != " ")
        {
            if(map.containsKey(word))
            {
                map.put(word,map.get(word)+1);
            }
            else
            {
                map.put(word,1);
            }
        }
        
        return map;
        
    }
}