package Leetcode.Easy;

/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Easy\CountPrefixAndSuffixPairs1.java
 * 
 * @author Kritika Srivastava
 * @since January 10, 2025
 *
 *        Link: https://leetcode.com/problems/count-prefix-and-suffix-pairs-i/
 */
public class CountPrefixAndSuffixPairs1 {

    public int countPrefixSuffixPairs(String[] words) {
        int ans = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].startsWith(words[i]) && words[j].endsWith(words[i])) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
