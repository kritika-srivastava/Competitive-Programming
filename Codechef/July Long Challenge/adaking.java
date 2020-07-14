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
		    {   int n=kb.nextInt();
		    char a[][]=new char[8][8];
		    
		    for(int i=0;i<8;i++)
		    {
		        for(int j=0;j<8;j++)
		        {
		            if(i==0 && j==0){a[i][j]='O';}
		            else if(n!=1)
		                {
		                   a[i][j]='.';n--;
		                }
		                else{
		                    a[i][j]='X';
		                }
		                
		        }
		        
		    }
		    for(int i=0;i<8;i++)
		    {
		        for(int j=0;j<8;j++)
		        {
		            System.out.print(a[i][j]);
		        }
		        System.out.println();
		    }
		    
		        
		    }
		    
		}
		catch(Exception e)
		{
		    return ;
		}
	}
}
