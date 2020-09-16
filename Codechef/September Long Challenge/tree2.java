/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class tree2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try(Scanner kb=new Scanner(System.in))
		{
		    int t=kb.nextInt();
		    
		    while(t-->0)
		    {
		        int n=kb.nextInt();
		        Integer a[]=new Integer[n];
		        for(int i=0;i<n;i++)
		        {
		            a[i]=kb.nextInt();
		            }
		        
                Set<Integer> set = new HashSet<>(Arrays.asList(a));
                if(set.contains(0))
                {
		        System.out.println(set.size()-1);
                }
                else{
                    System.out.println(set.size());
                }
		    }
		}
		catch(Exception e)
		{return;}
	}
}
