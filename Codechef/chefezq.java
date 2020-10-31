/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class chefezq
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
	    int t=s.nextInt();
	    while(t-->0)
	    {
	        int n=s.nextInt();
	        int k=s.nextInt();
	        int[] a=new int[n];
	        
	        for(int i=0;i<n;i++)
	        a[i]=s.nextInt();
	        int count=0;
	        boolean flag=false;
	        long sum=0,sum1=0;
	        for(int i=0;i<n;i++)
	        {
	            sum=sum+a[i];
	            sum1=sum1+k;
	            if(sum1>sum)
	            {
	                System.out.println(count+1);
	                flag=true;
	                break;
	            }
	            else
	            {
	                count++;
	            }
	        }
	        if(!flag && n>0)
	        {
	         System.out.println((sum-sum1)/k+1+count);   
	        }
	    }
	}
}
