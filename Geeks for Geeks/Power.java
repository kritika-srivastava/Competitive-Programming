import java.util.Scanner;
import java.lang.*;
import java.io.*;
class Power
 {
	public static void main (String[] args)
	 {
	   Scanner kb=new Scanner(System.in);
	    int t=kb.nextInt();
	    while(t-->0)
	    {
	    int x=kb.nextInt();
        int y=kb.nextInt();
	    double out=Math.log(y)/Math.log(x);
	    if(out-(int)out==0)
	    {System.out.println("1");}
	    else
	    {System.out.println("0");}
        }
	 }
}
