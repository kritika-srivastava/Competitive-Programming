/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Even_Matrix
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try(Scanner kb=new Scanner(System.in))
		{
		    int t=kb.nextInt();
	while(t-->0)
		    {
		        int n=kb.nextInt();
		        int mm=1,nn=0,k=0;
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<n;j++)
		        {
		            if(i%2==0){
		            k=0;
		            System.out.print(mm+" ");
		            mm++;
		        }
		        else
		        {
		              
		           if(k==0){ nn=mm+n-1;mm=nn+1;k++;}
		           else{}
		           System.out.print(nn+" ");
		           nn--;
		        }
		    }
		        System.out.println();
		    }
		    
		}
		}
		catch(Exception e)
		{
		    return ;
		}
	}
}
