import java.util.Scanner;
import java.lang.*;
import java.io.*;
class Quick_left_Array_rotation
 {
	public static void main (String[] args)
	 {
	     Scanner kb=new Scanner(System.in);
	     int t=kb.nextInt();
	     while(t-- >0)
	     {
	         int size=kb.nextInt();
	         int r=kb.nextInt();
	         int a[]=new int[size];
	         int ar[]=new int[size];
	         for(int i=0;i<size;i++)
	         {
	             a[i]=kb.nextInt();
	         }
	         int k=0;
	         while(r>=size)
	         {r=r-size;}
	         int i=0,j=r;
	         for(;i<size-r && j<size;i++,j++)
	         {
	             ar[i]=a[j];k++;
	         }
	         i=0;
	         while(k<size)
	         {
	           ar[k]=a[i] ;
	           k++;i++;
	         }
	         for(i=0;i<size;i++)
	         {
	             System.out.print(ar[i]+" ");
	         }
	         System.out.println();
	     }
	 }
}
