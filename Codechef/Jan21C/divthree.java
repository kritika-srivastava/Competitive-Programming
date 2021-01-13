/**
 * C:\Users\kriti\Desktop\GFG.java
 * @author Kritika Srivastava
 * @since January 13, 2021
 *
 * Link - https://www.codechef.com/JAN21C/problems/DIVTHREE
 */
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner kb=new Scanner(System.in);
		int t=kb.nextInt();
		while(t-->0)
		{
		    int n=kb.nextInt();
		    int k=kb.nextInt();
		    int d=kb.nextInt();
		    int a[]=new int[n];
		    int out=0,left=0;
		    for(int i=0;i<n;i++)
		    {
		        
		        a[i]=kb.nextInt();
		        left+=a[i];
		        out+=left/k;
		        left%=k;
		       
		        
		    }
		    System.out.println(Math.min(out,d));
		    
		}
	}
}
