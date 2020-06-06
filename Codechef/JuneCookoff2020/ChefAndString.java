/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndString
{
	public static void main (String[] args) throws java.lang.Exception
	{
	try(Scanner kb=new Scanner(System.in))
		{
		    int t=kb.nextInt();
		    while(t-->0)
		    {   int n=0;
		        String st=kb.next();
		        char a[]=new char[st.length()];
		        for(int i=0;i<st.length();i++)
		        {
		           a[i]=st.charAt(i);
		        }
		        for(int i=1;i<st.length();i++)
		        {
		            if(a[i]=='x' && a[i-1]=='y')
		            {n++;a[i]=' ';a[i-1]=' ';}
		            else if(a[i]=='y' && a[i-1]=='x')
		            {n++;a[i]=' ';a[i-1]=' ';}
		            else{}
		        }
		        System.out.println(n);
		        
		    }
		    
		}
		catch(Exception e)
		{
		    return ;
		}
	}
}
