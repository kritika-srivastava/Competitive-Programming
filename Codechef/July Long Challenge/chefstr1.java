/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try(Scanner kb=new Scanner(System.in))
		{
		    int t=kb.nextInt();
		    while(t-->0)
		    {
		        int n=kb.nextInt();
		        
		        int a[]=new int[n];
		        long sum=0;
		        for(int i=0;i<n;i++)
		        {
		            a[i]=kb.nextInt();
		            if(i>=1)
		            {sum+=(Math.abs(a[i]-a[i-1])-1);}
		            else{}
		        }
		        System.out.println(sum);
		    }
		    
		}
		catch(Exception e)
		{
		    return ;
		}
	}
}
