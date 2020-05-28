import java.util.Scanner;
import java.lang.*;
import java.io.*;
class Minimum_element_in_sorted_and_rotated_arr
 {
	public static void main (String[] args)
	 {
	 Scanner kb=new Scanner(System.in);
	 int t=kb.nextInt();
	 while(t-- !=0)
	 {
	     int s=kb.nextInt();
	     int a[]=new int[s];
	     for(int i=0;i<s;i++)
	     {
	         a[i]=kb.nextInt();
	     }
	     
	     int k=0;
	     for(int i=1;i<s;i++)
	     {
	         if(a[i]<a[i-1])
	         {
	             k=a[i];break;
	         }
	         else{}
	     }
	     if(k==0){k=a[0];}
	     else{}
	     
	     System.out.println(k);
	     
	 }
	 }
}
