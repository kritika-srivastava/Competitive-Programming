/**
 * C:\Users\kriti\Desktop\GFG.java
 * @author Kritika Srivastava
 * @since January 13, 2021
 *
 * Link - https://www.codechef.com/JAN21C/problems/DECODEIT
 */
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class decodeit
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner kb=new Scanner(System.in);
		int t=Integer.parseInt(kb.nextLine());
		char[] b={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'};
		while(t-->0)
		{
		    int n=Integer.parseInt(kb.nextLine());
		    String m=kb.nextLine();
		    String out="";
		    for(int i=0;i<n/4;i++)
		    {
		        String s=m.substring(4*i,4*i+4);
		        int nn=Integer.parseInt(s,2);
		        out+=b[nn];
		    }
		    System.out.println(out);
		}
	}
}
