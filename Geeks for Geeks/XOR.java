// { Driver Code Starts
import java.util.*;
class XOR
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		  int n = sc.nextInt();
		  int[] a = new int[10004];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
		  GfG g = new GfG();
		  System.out.println(g.maxSubarrayXOR(a , n));
		}
	}
}// } Driver Code Ends


/*Complete the function below*/
class GfG
{
    
    static final int INT_BITS = 32; 
     public static int maxSubarrayXOR(int set[], int n)
    {
                    
    int index = 0; 
   
    for (int i = INT_BITS - 1; i >= 0; i--)  
    { 
    
    int maxInd = index; 
    int maxEle = Integer.MIN_VALUE; 
    for (int j = index; j < n; j++) { 
       
        if ((set[j] & (1 << i)) != 0 && set[j] > maxEle) 
        { 
        maxEle = set[j]; 
        maxInd = j; 
        } 
    } 
    
    if (maxEle == -2147483648) 
        continue; 
  
    int temp = set[index]; 
    set[index] = set[maxInd]; 
    set[maxInd] = temp; 
    maxInd = index; 
    for (int j = 0; j < n; j++) { 
      
        if (j != maxInd && (set[j] & (1 << i)) != 0) 
        set[j] = set[j] ^ set[maxInd]; 
    } 
    index++; 
    }
    
    
    int res = 0; 
    for (int i = 0; i < n; i++) 
    {res ^= set[i]; }
    return res; 
}
    
}
