/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Covid_sampling
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try(Scanner kb=new Scanner(System.in))
		{
		    int t=kb.nextInt();
		    while(t-->0)
		    {
		        int n=kb.nextInt();
		        int p=kb.nextInt();
		        int arr[][]=new int[n][n];
		        System.out.println("1 "+"1 "+"1 "+n+" "+n+" ");
		        int total=kb.nextInt();
		      md:  for(int i=0;i<n;i++)
		        {   if(total>0)
		           {
		            System.out.println("1 "+(i+1)+" "+"1 "+(i+1)+" "+n+" ");  
		            int row=kb.nextInt();
		            if(row==0)
		            {continue md;}
		            else
		            { 
		                for(int j=0;j<n/2;j++)
		                {   if(row>0)
		                   { System.out.println("1 "+(i+1)+" "+(j+1)+" "+(i+1)+" "+(j+1));
		                    int el=kb.nextInt();
		                    if(el==1)
		                    {   arr[i][j]=1;
		                        row--;
		                    total--;}
		                    else{}
		                   }
		                   else{break;}
		                }
		                for(int j=n/2;j<n;j++)
		                {   if(row>0)
		                   { System.out.println("1 "+(i+1)+" "+(j+1)+" "+(i+1)+" "+(j+1));
		                    int el=kb.nextInt();
		                    if(el==1)
		                    {   arr[i][j]=1;
		                        row--;
		                    total--;}
		                    else{}
		                   }
		                   else{break;}
		                }
		            }
		           }
		           else{break;}
		        }
		        System.out.println(2);
		        for(int i=0;i<n;i++)
		        {
		            for(int j=0;j<n;j++)
		                {
		                    System.out.print(arr[i][j]+" ");
		                    
		                }
		            System.out.println();
		        }
		        int x=kb.nextInt();
		        if(x==1)
		        {}
		        else {break;}
		    }
		    
		}
		catch(Exception e)
		{
		    return ;
		}
	}
}
