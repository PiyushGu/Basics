import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

        public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    int sticks [] = new int[size];
    for (int i = 0; i < size; i++){
        sticks[i] = scan.nextInt();
    }    
    Arrays.sort(sticks);
    do {
    int count =0;
    int leastLength = sticks[0];
    for (int j=0; j < sticks.length; j++){
        sticks[j] = sticks[j] - leastLength;
        count++;
    }
    System.out.println(count);
    List<Integer> resizeArray = new LinkedList<Integer>();
    for ( int i=0; i< sticks.length; i++){
        if (sticks[i] != 0){
            resizeArray.add(sticks[i]);
        }
    }
    int temp[] = new int[resizeArray.size()];
      for (int i = 0; i < resizeArray.size(); i ++){
          temp[i] = resizeArray.get(i);
      }
      sticks = temp;
    } while (sticks.length > 0);
}
    }
