/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class B
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner kb=new Scanner(System.in);
		int t=kb.nextInt();
		
		while(t-->0)
		{
		    int n=kb.nextInt();
		    int arr[]=new int[n];
		    int zero=0, one=0, minus_one=0, other=0;
		     
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=kb.nextInt();
		       if(arr[i]==0)
		       {
		           zero++;
		       }
		       else if(arr[i]==1)
		       {
		           one++;
		       }
		       else if(arr[i]==-1)
		       {
		           minus_one++;
		       }
		       else{
		           other++;
		       }
		    }
		    boolean flag=true;
		     
		     if( (other > 1) || (minus_one > 1 && one == 0) || (minus_one > 0 && other > 0))
		     {flag=false;}
		     
		    if(flag)
		    {
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		}
	}
}
