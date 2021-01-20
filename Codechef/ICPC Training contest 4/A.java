/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner kb=new Scanner(System.in);
		int t=kb.nextInt();
		while(t-->0)
		{
		    int x1=kb.nextInt();
		    int y1=kb.nextInt();
		    int x2=kb.nextInt();
		    int y2=kb.nextInt();
		    
		    if(x1==x2)
		    {
		        if(y2>y1)
		        {
		            System.out.println("up");
		        }
		        else
		        {
		            System.out.println("down");
		        }
		    }
		    else if(y1==y2)
		    {
		        if(x2>x1)
		        {
		            System.out.println("right");
		        }
		        else
		        {
		            System.out.println("left");
		        }
		    }
		    else{
		        System.out.println("sad");
		    }
		}
	}
}
