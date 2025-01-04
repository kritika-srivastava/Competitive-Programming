package Leetcode.Medium;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\uniqueLength3PalindromicSubstrings.java
 * @author Kritika Srivastava
 * @since January 04, 2025
 *
 * Link: https://leetcode.com/problems/unique-length-3-palindromic-subsequences
 */
import java.util.Arrays;
import java.util.HashSet;

public class uniqueLength3PalindromicSubstrings {
    public int countPalindromicSubsequence(String s) {
        HashSet ans=new HashSet<String>();
        int first[]=new int[26];
        int last[]=new int[26];
        Arrays.fill(first,-1);

        for(int i=0;i<26;i++){
            char c=(char)(97+i);
                if(s.indexOf(c)!=s.lastIndexOf(c)){
                    first[i]=s.indexOf(c);
                    last[i]=s.lastIndexOf(c);
                }
                else{}
        }
        for(int i=0;i<26;i++){
            if(first[i]!=-1){
                
                for(int j=first[i]+1;j<last[i];j++){
                    String temp=Integer.toString(97+i)+s.charAt(j)+Integer.toString(97+i);
                    ans.add(temp);
                }
            }
        }

        return ans.size();

    }
}