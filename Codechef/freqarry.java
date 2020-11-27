/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class freqarry
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner kb=new Scanner(System.in);
		int t=kb.nextInt();
		while(t-->0)
    {
        int n=kb.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=kb.nextInt();
        }
        Arrays.sort(a);
        boolean flag = true;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]==a[i+1])
            {
                flag=false;
            }
        }
        if(flag)
        {
            System.out.println("prekrasnyy");
        }
        else{
            System.out.println("ne krasivo");
        }
    }
	}
}
