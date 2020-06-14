/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Chef_and_String
{
	public static void main (String[] args) throws java.lang.Exception
	{
	try{
	    Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i = 0; i <T; i++) {
            int N=sc.nextInt();
            int[] arr=new int[N];;
            for (int j = 0; j <N; j++) {
                arr[j]=sc.nextInt();
            }
            HashSet<Integer> count=new HashSet<>();
            HashSet<Integer> visited=new HashSet<>();
            int previous=0;
            int times=0;
            String ans="YES";
            for (int j = 0; j <N; j++) {
                int val=arr[j];
                if(val!=previous){
                    visited.add(previous);
                    previous=val;
                    if(!count.contains(times)){
                        count.add(times);
                    }
                    else{
                        ans="NO";
                        break;
                    }
                    times=0;
                }
                if(!visited.contains(val)){
                    times++;
                }
                else{
                    ans="NO";
                    break;
                }

            }
            if(!visited.contains(arr[N-1])){
                if(count.contains(times)){
                    ans="NO";
                }
            }
            else{
                ans="NO";
            }
            System.out.println(ans);
        }
        
	}
	catch(Exception e){
	    return;
	}
	}
}
