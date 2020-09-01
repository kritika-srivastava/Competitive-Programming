//https://www.codechef.com/LRNDSA01/problems/TEST

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Test
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try(Scanner kb=new Scanner(System.in))
		{
		    int n=0;
		       while(n!=42)
		        {
		            n=kb.nextInt();
		            if(n==42){break;}
		            else{
		            System.out.println(n);
		            }
		        }
		    }
		
		catch(Exception e)
		{
		    return;
		}
	}
}
