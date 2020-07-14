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
		    {
		        int n=kb.nextInt();
		        long chef=0,morty=0,win=0;
		        for(long i=0;i<n;i++)
		        {
		           long a=kb.nextLong();
		           long b=kb.nextLong();int k=1;
		           for(int j=0;j<k;j++)
		           {
		               long x=a;long sum=0;
		               while(x/1 !=0)
		               {
		                   long y=x%10;
		                   sum+=y;
		                   x=x/10;
		               }
		               a=sum;
		           }
		           for(int j=0;j<k;j++)
		           {
		               long x=b;long sum=0;
		               while(x/1 !=0)
		               {
		                   long y=x%10;
		                   sum+=y;
		                   x=x/10;
		               }
		               b=sum;
		           }
		           
		           if(a>b){chef++;}
		           else if(b>a){morty++;}
		           else if(a==b){chef++;morty++;}
		           else{}
		        }
		        if(chef>morty){System.out.println("0 "+chef);}
		        else if(morty>chef){System.out.println("1 "+morty);}
		        else{System.out.println("2 "+chef);}
		        
		    }
		    
		}
		catch(Exception e)
		{
		    return ;
		}
	}
}
