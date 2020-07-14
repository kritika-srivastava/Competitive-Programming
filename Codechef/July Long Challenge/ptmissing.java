/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try(Scanner kb=new Scanner(System.in))
		{
		    int t=kb.nextInt();
		    while(t-->0)
		    {   int k=0,l=0;
		        int n=kb.nextInt();
		        int s=4*n-1;
		        int xx=0,yy=0;
		        int x[]=new int[s];
		        int y[]=new int[s];
		        for(int i=0;i<s;i++)
		        {
		            x[i]=kb.nextInt();
		            y[i]=kb.nextInt();
		           
		        }
		        Arrays.sort(x);
		        Arrays.sort(y);
		         for(int i=0;i<s-1;)
		        {
		            if(i==0)
		            {
		                if(x[i]!=x[i+1])
		                {
		                    xx=x[i];k=1;break;
		                }
		               
		                else{i+=2;}
		            }
		            else
		            {
		                if(x[i]!=x[i+1])
		                {
		                    xx=x[i];k=1;break;
		                }
		                else{i+=2;}
		            }
		        }
		        for(int i=0;i<s-1;)
		        {
		            if(i==0)
		            {
		                if(y[i]!=y[i+1])
		                {
		                    yy=y[i];l=1;break;
		                }
		                
		                else{i+=2;}
		            }
		            else
		            {
		              if(y[i]!=y[i+1])
		                {
		                    yy=y[i];l=1;break;
		                }
		                else{i+=2;}
		            }
		        }
		        if(k==0){xx=x[s-1];}
		        else{}
		        if(l==0){yy=y[s-1];}
		        else{}
		        System.out.println(xx+" "+yy);
		        
		        
		    }
		    
		}
		catch(Exception e)
		{
		    return ;
		}
	}
}
