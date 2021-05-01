/**
 * E:\#Fod Do\Competitive-Coding\Geeks for Geeks\Geek_and_code.java
 * @author Kritika Srivastava
 * @since May 01, 2021
 *
 * Link - https://practice.geeksforgeeks.org/problems/geek-and-code/0/
 */
import java.util.*;

class Geek_and_code
 {
	public static void main (String[] args)
	 {
	 Scanner kb=new Scanner(System.in);
	 int t=kb.nextInt();
	 while(t-->0)
	 {
	     int n=kb.nextInt();
	     String s=Integer.toBinaryString(n);
	     int ret=0;
	     for(int i=0;i<s.length();i++)
	     {
	         if(s.charAt(i)=='1')
	         {
	             ret++;
	         }else{}
	     }
	     System.out.println(ret);
	 }
	 }
}