import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
       // int n = 0;
        //System.out.println(br.read());
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<String> a = new ArrayList<String>(Arrays.asList(br.readLine().split(" ")));
        for ( int i = 0 ; i < n ; i++ )
                {
                    A.add(Integer.parseInt(a.get(i)));
        }
        
        int m =  Integer.parseInt(br.readLine());
        ArrayList<String> b = new ArrayList<String>(Arrays.asList(br.readLine().split(" ")));
        //ArrayList<Integer> B = new ArrayList<Integer>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0 ; i < m ; i++ )
                {
                    int key = Integer.parseInt(b.get(i));
                    if(map.containsKey(key))
                        {
                        map.put(key, map.get(key)+1);
                    }
            else
                {
                 map.put(key, 1);
            }
        }
        
        ArrayList<Integer> missingNumber = new ArrayList<Integer>();
        
        for(int i = 0 ; i< n; i++)
            {
            if(map.containsKey(A.get(i)))
                {
                 map.put(A.get(i), map.get(A.get(i))-1);
            }
        }
        
       Iterator it = map.keySet().iterator();
        
      while(it.hasNext())
           {
          int key = (Integer)it.next();
           if(map.get(key) > 0)
               missingNumber.add(key);
       }
        
        Collections.sort(missingNumber);
      
        for(int i = 0; i< missingNumber.size() ;i++ )
       { System.out.print(missingNumber.get(i));
        System.out.print(" ");
       }
    

    }
}