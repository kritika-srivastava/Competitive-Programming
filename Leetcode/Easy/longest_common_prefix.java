/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/longest_common_prefix.java
 * 
 * @author Kritika Srivastava
 * @since June 14, 2021
 *
 *        Description - Write a function to find the longest common prefix
 *        string amongst an array of strings. If there is no common prefix,
 *        return an empty string "".
 * 
 *        Link - https://leetcode.com/problems/longest-common-prefix/
 * 
 */
public class longest_common_prefix {
    public String longestCommonPrefix(String[] strs) {
        String ret = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(ret) != 0) {
                ret = ret.substring(0, ret.length() - 1);
            }
        }
        return ret;
    }
}
