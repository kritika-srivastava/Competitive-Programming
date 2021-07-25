// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Generate_parentheses{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        }
    }
}

class Solution {
    
    public List<String> AllParenthesis(int n) 
    {
        List<String> l=new LinkedList<String>();
        
        backtrack(l,"",0,0,n);
        return l;
    }
    static void backtrack(List<String> l,String s,int open,int close,int n)
    {
        if(s.length()==2*n)
        {
                l.add(s);
                return;
        }
            if(open<n) 
           { 
            backtrack(l,s+"(",open+1,close,n);
           }
           if(close<open)
           {
            
            backtrack(l,s+")",open,close+1,n);
            
           }
    }
    
}