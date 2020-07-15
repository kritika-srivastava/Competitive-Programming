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
		        String m="NO";
		        for(int i=0;i<n;i++)
		        {
		            a[i]=kb.nextInt();
		      }  		        
		      Arrays.sort(a);
		      int k=0;
		          for(int j=0;j<n;j++)
		          {
		              if(a[j]%2==0)
		              {k++;break;}
		          }
		          if(k==0)
		          {m="YES";}
		          else
		          {}
		          System.out.println(m);
		    }
		    
		}
		catch(Exception e)
		{
		    return ;
		}
	}
}
