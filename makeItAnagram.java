import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
         int count = 0;
         if (s1 == null || s2 == null || s1.equals("") || s2.equals("")) {
        count = 0;
    }
   
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();
    if (s1.equals(s2)) {
        count = 0;
    }
    
    int[] charCountS1 = new int[26];
    int[] charCountS2 = new int[26];
    int indexOfChar = -1;
    
    char[] sc1 = s1.toCharArray();
    char[] sc2 = s2.toCharArray();
                    
    for (int i = 0; i < sc1.length; i++) {
        indexOfChar = sc1[i] - 'a';
        charCountS1[indexOfChar]++;
    }

    for (int i = 0; i < sc2.length; i++) {
        indexOfChar = sc2[i] - 'a';
        charCountS2[indexOfChar]++;
    }

    int numChars = 0;
    for (int i = 0; i < charCountS1.length; i++) {
        if (charCountS1[i] != charCountS2[i]) {
            while (charCountS1[i] > charCountS2[i]) {
                charCountS1[i]--;
                numChars++;
            }

            while (charCountS1[i] < charCountS2[i]) {
                charCountS2[i]--;
                numChars++;
            }
        }
    }
    
    System.out.println(numChars);
    }
}