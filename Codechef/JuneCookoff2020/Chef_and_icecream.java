/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Chef_and_icecream
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try(Scanner kb=new Scanner(System.in))
		{
		    int t=kb.nextInt();
		    while(t-->0)
		    {
		        int n=kb.nextInt();
		        int a[]=new int[n];
		        int b[]=new int [3];
		        int sum=0,k=0;String s="YES";
		        for(int i=0;i<n;i++)
		        {
		            a[i]=kb.nextInt();
		            if(a[i]==5 || a[i]==10){k++;}
		            else{}
		            
		        }
		        for(int i=0;i<n;i++)
		        {
		            if(i==0)
		            {
		                if(a[i]>5){s="NO";break;}
		                else{sum+=a[i];b[0]++;}
		            }
		            
		            else if((a[i]-5)<=sum)
		            {
		                int tmp=a[i]-5;
		                if(tmp==10)
		                {
		                    if(b[1]>=1)
		                {   b[1]--;
		                    b[2]++;
		                    sum+=a[i];
		                    sum-=(a[i]-5);
		                }
		                else if(b[0]>=2)
		                {   b[0]-=2;
		                    b[2]++;
		                    sum+=a[i];
		                    sum-=(a[i]-5);
		                }
		                else {s="NO";break;}
		                }
		                else if(tmp==5)
		                {
		                  if(b[0]>=1)
		                {   b[0]--;
		                    b[1]++;
		                    sum+=a[i];
		                    sum-=(a[i]-5);
		                } 
		                else {s="NO";break;}
		                }
		                else if(tmp==0)
		                {sum+=5;b[0]++;}
		                else{}
		            }
		            else 
		            {s="NO";break;}
		        }
		        System.out.println(s);
		    }
		    
		}
		catch(Exception e)
		{
		    return ;
		}
	}
}
