/* package codechef; // don't place package name! */
/*
 Consider a very long K-digit number N with digits d0, d1, ..., dK-1 (in decimal notation; d0 is the
 most significant and dK-1 the least significant digit). This number is so large that we can't give it 
 to you on the input explicitly; instead, you are only given its starting digits and a way to construct
 the remainder of the number.

Specifically, you are given d0 and d1; for each i ≥ 2, di is the sum of all preceding (more significant)
digits, modulo 10 — more formally, the following formula must hold:

Determine if N is a multiple of 3. 
*/
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Long_multiple_of_3
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s = new Scanner (System.in);
	int T = s.nextInt();
	while(T --> 0){
	    long k = s.nextLong();
	    int d0 = s.nextInt();
	    int d1 = s.nextInt();
	    int tot = d0+d1;
	    long sum = tot;
	    
	    if(k>=3){
	        int d2 = (d0+d1)%10;
	        sum+=d2;
	        long quot = (k-3)/4;
	        long rem = (k-3)%4;
	        
	        int modulus = (2*tot)%10 + (4*tot)%10 + (8*tot)%10 + (6*tot)%10;
	        
	        sum+=quot*modulus;
	        int temp = tot;
	        while(rem --> 0){
	            temp = 2*temp;
	            sum+=temp%10;
	        }
	    }
	    if(sum%3 == 0){
	        System.out.println("YES");
	    }
	    else{
	        System.out.println("NO");
	        
	    }
	}
		    
		
	}
}
