/**
 * E:\#Fod Do\Target 450\Codes\q441.java
 * @author Kritika Srivastava
 * @since March 19, 2021
 *
 * Count number of bits to be flipped in order for the integer A to convert to B.
 * Link - https://practice.geeksforgeeks.org/problems/bit-difference-1587115620/1#
 */
import java.util.*;
import java.io.*;

class q441 {
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int m, n;
		long ans = 0; // initialise ans to 0
		while(t-->0) {
		    
		    //input m and n
		    m = sc.nextInt();
		    n = sc.nextInt();
		    System.out.println(countBitsFlip(m, n));
		}
	}
    public static int countBitsFlip(int a, int b){
        
        int m=a^b;
        String n=Integer.toBinaryString(m);
        int ret=0;
        for(int i=0;i<n.length();i++)
        {
            if(n.charAt(i)=='1')
            {
                ret++;
            }
            else{}
        }
        return ret;
        
    }
}

  // } Driver Code Ends