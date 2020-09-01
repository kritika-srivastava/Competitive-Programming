//https://www.codechef.com/LRNDSA01/problems/CARVANS

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Carvans
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
		        int k=0,min=0;
		        for(int i=0;i<n;i++)
		        {
		            a[i]=kb.nextInt();
		            
		            if(i==0)
		            {min=a[i];k++;
		            }
		            else if(a[i]<min)
		            {min=a[i];k++;}
		            else{}
		        }
		        System.out.println(k);
		        
		    }
		}
		catch(Exception e)
		{
		    return;
		}
	}
}
