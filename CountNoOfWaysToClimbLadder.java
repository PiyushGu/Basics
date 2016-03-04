//A child is running up a staircase with n steps, and can hop either 1step, 2 steps, or
//3 steps at a time. Implement a method to count how many possible ways the child
//can run up the stairs

public class Main
{
    static public void main(String[] args)
    {
        int[] mem = new int[11];
        System.out.println(CountNoOfWays(10,mem));
    }
    
    static public int CountNoOfWays(int n,int[] m)
    {
        if(n<0)
            return 0;
        else if(n == 0)
            return 1;
        else if(m[n] > 0)
            return m[n];
        else
        {
            m[n] = CountNoOfWays(n-1,m) + CountNoOfWays(n-2,m) +CountNoOfWays(n-3,m);
            return m[n];
        }
    }
    
}