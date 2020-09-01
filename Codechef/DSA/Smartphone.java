// https://www.codechef.com/LRNDSA01/problems/ZCO14003

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Smartphone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try(Scanner kb=new Scanner(System.in))
		{
		    
		        int n=kb.nextInt();
		        long a[]=new long[n];
		        long k=n,max=0;
		        for(int i=0;i<n;i++)
		        {
		            a[i]=kb.nextLong();
		        }
		        Arrays.sort(a);
		        for(int i=0;i<n;i++)
		        {
		            long tmp=k*a[i];
		            if(tmp>max)
		            {max=tmp;}
		            k--;
		            
		        }
		        System.out.println(max);
		        
		    }
		
		catch(Exception e)
		{
		    return;
		}
	}
}
