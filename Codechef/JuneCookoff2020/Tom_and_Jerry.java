/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Tom_and_Jerry
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try(Scanner kb=new Scanner(System.in))
		{
		    long t=kb.nextLong();
		    
		    while(t-->0)
		    {
		        long n=kb.nextLong();
		        long k=0,nn=2;
		        if(n%2==0)
		        {long m=n;
		            while(n%2==0)
		            {
		                n=n/2;nn=nn*2;
		            }
		            k=(m/nn);
		       
		       }
		  
		        else{
		       k=(n-1)/2;}
		        System.out.println(k);
		    }
		    
		
		}
		catch(Exception e)
		{
		    return ;
		}
	}
}
