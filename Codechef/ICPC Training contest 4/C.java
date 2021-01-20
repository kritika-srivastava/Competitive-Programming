/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class C
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner kb=new Scanner(System.in);
		int t=kb.nextInt();
		while(t-->0)
		{
		    int d=kb.nextInt();
		    int n=d+1;
		    while(n>9)
		    {
		        int m=0;
		        while (n>0)
		        {
		            m+=n%10;
		            n/=10;
		        }
		        n=m;
		    }
		    System.out.println(n);
		}
	}
}

