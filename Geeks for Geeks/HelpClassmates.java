// Link - https://practice.geeksforgeeks.org/contest-problem/02b479e4b5f0ad99d013683c864070bc9ce0491b/1/
// { Driver Code Starts
//Initial Template for Java


import java.util.*; 
import java.io.*; 

class HelpClassmates
{ 
	public static void main (String[] args) { 
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            int array[] = new int[n];
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }

            Solution ob = new Solution();

            int ans[] = ob.help_classmate(array,n);

           	for (int i=0; i<n; i++) 
                System.out.print(ans[i]+" "); 
            System.out.println();
            t--;
        }
	} 
} 

// } Driver Code Ends


//User function Template for Java

class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    int b[]=new int[n];
	    for(int i=0;i<n;i++)
	    {b[i]=-1;}
	    for(int i=0;i<n;i++)
	    {
	        for(int j=i+1;j<n;j++)
	        {
	            if(arr[j]<arr[i])
	            {
	                b[i]=arr[j];break;
	                
	            }
	            else{}
	        }
	    }
	    return b;
	} 
}
