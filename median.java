import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numArray = new int[n];
        for(int i = 0 ; i< n; i++)
            {
            numArray[i] = sc.nextInt();
        }
        int median = -1;
        Arrays.sort(numArray);
int middle = ((numArray.length) / 2);
if(numArray.length % 2 == 0){
 int medianA = numArray[middle];
 int medianB = numArray[middle+1];
 median = (medianA + medianB) / 2;
} else{
 median = numArray[middle];
}
        
        System.out.println(median);
    }
}