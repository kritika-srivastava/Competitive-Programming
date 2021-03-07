/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PH_01
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner kb=new Scanner(System.in);
		int t=kb.nextInt();
		while(t-->0)
		{
		    int n=kb.nextInt();
		    int flag=0;
		    while(n>0)
		    {
		        int x=n%10;
		        if(x==7)
		        {
		            flag=1;
		        }
		        else{}
		        n/=10;
		    }
		    if(flag==1)
		    {
		        System.out.println("True");
		    }
		    else{
		        System.out.println("False");
		    }
		    
	        
		}
	}
}
