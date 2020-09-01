//https://www.codechef.com/LRNDSA01/problems/FLOW007

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Flow007
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try(Scanner kb=new Scanner(System.in))
		{
		        int n=Integer.parseInt(kb.nextLine());
		        for(int i=0;i<n;i++)
		        {
		            StringBuffer sb=new StringBuffer(kb.next());
		            System.out.println(Integer.parseInt(sb.reverse().toString()));
		        }
		    }
		
		catch(Exception e)
		{
		    return;
		}
	}
}
