/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Fctrl
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try(Scanner kb=new Scanner(System.in))
		{
		    int t=kb.nextInt();
		    while(t-->0)
		    {
		        int n=kb.nextInt();
		        int zero=0;
		        while(n!=0)
		        {
		            zero+=n/5;
		            n/=5;
		        }
		        System.out.println(zero);
		    }
		}
		catch (Exception E)
		{return;}
	}
}
