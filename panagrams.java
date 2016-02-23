import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

     public static final int n = 26; 

    public int check(String arr){
       // int count = 0;
        if(arr.length() < n){
           return -1;
        }
        for(char c = 'A'; c <= 'Z' ; c++){
            if((arr.indexOf(c) < 0) && (arr.indexOf((char)(c + 32)) < 0)){
               return -1;
            }
        }
        return 1;
    }


    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        String s = s1.nextLine();
        Solution obj = new Solution();

        int d = obj.check(s);

        if(d == -1)
            System.out.print("not pangram");
        else
             System.out.print("pangram");

    }
}














-----------------

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

     public static int n = 26; 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String arr = sc.nextLine();
        
       int isPana = 1;
       if(arr.length() < n){
           isPana =  -1;
        }
        else
            {
        for(char c = 'A'; c <= 'Z' ; c++){
            if((arr.indexOf(c) < 0) && (arr.indexOf((char)(c + 32)) < 0)){
               isPana = -1;
                break;
            }
        
        }
        }
        if(isPana == -1)
            System.out.print("not pangram");
        else
             System.out.print("pangram");

    }
}