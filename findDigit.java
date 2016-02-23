import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int count = 0;
            int n = in.nextInt();
            int num = n;
            while (n > 0) {
            int rem = n%10;
            n = n / 10;
            if(rem > 0)
                {
                if(num%rem == 0)
                    {
                    count++;
                }
            }
            }
            
            System.out.println(count);
        }
    }
}
