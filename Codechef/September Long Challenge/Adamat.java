/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Adamat
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try(Scanner kb=new Scanner(System.in))
		{
		    int t=kb.nextInt();
		    
		    while(t-->0)
		    {
		        int n = kb.nextInt();
                int a[][] = new int[n][n];
                int b[][] = new int[n][n];
                int k = 1, l = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        a[i][j] = kb.nextInt();
                        b[i][j] = k;
                        k++;
                    }
                }

                for (int i = n - 1; i >= 0; i--) {
                    if (a[i][0] != b[i][0]) {
                        l++;
                        for (int ii = 0; ii < a.length; ii++)
                            for (int jj = ii; jj < a[0].length; jj++) {
                                int temp = a[jj][ii];
                                a[jj][ii] = a[ii][jj];
                                a[ii][jj] = temp;
                            }
                    } else {
                    }
                }
                System.out.println(l);
		    }
		}
		catch(Exception e)
		{return;}
	}
}
