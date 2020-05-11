/*Count the number of 2s as digit in all numbers from 0 to n.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains the input integer n.

Output:
Print the count of the number of 2s as digit in all numbers from 0 to n.*/

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            GfG gfg = new GfG();
            long res = gfg.count2s(n);
            System.out.println(res);
        }
        
    }
}
class GfG
{
    public static long count2s(long n)
    {
        return count2sinRangeAtDigit(n);
    }
    
    public static long count2sinRangeAtDigit(long n)
    {
       
        int l=0;String a="";
        if ((n>=1)&(n<=Math.pow(10,5)))
      {      for (long i=1;i<=n;i++)
          {
                  a=String.valueOf(i);
                int  m=a.length();
                 for(int k=0;k<m;k++)
                 {
                     if(a.charAt(k)=='2')
                     {
                         l++;
                     }
                     else{}
                 }
                 
             }
         }
         return l;
         
     }
} 
