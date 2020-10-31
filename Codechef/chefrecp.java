/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class chefrecp
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t > 0) {
            --t;
            int n = scanner.nextInt();
            int[] freq = new int[1001];
            int[] freq2 = new int[1001];
            int prev = -1;

            boolean ans = true;
            for (int i = 0; i < n; i++) {
                int k = scanner.nextInt();
                if(freq[k]>0 && prev!=k){
                    ans=false;
                }
                freq[k]++;
                prev=k;
            }
            if(!ans){
                System.out.println("NO");
                continue;
            }
            for (int i: freq) {
                if(i==0) continue;
                if(freq2[i]>0){
                    ans=false;
                    break;
                }
                freq2[i]++;
            }
            if(!ans){
                System.out.println("NO");
            }else{
                System.out.println("YES");

            }
        }
	}
}
