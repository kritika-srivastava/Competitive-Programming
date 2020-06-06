/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pricecon
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try(Scanner kb=new Scanner(System.in))
		{
		    int t=kb.nextInt();
		    while(t-->0)
		    {
		        int n=kb.nextInt();
		        int k=kb.nextInt();
		        int a[]=new int[n];
		        int sum=0;
		        for(int i=0;i<n;i++)
		        {
		            a[i]=kb.nextInt();
		            if(a[i]>k)
		            {sum+=(a[i]-k);}
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
