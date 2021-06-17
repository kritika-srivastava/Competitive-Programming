/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/Longest_palindromic_substring.java
 * 
 * @author Kritika Srivastava
 * @since June 17, 2021
 *
 *        Description - Given a string s, return the longest palindromic
 *        substring in s.
 * 
 *        Link - https://leetcode.com/problems/longest-palindromic-substring/
 */
public class Longest_palindromic_substring {
    public String longestPalindrome(String s) {
        String max = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = extend(s, i, i), s2 = extend(s, i, i + 1);
            if (s1.length() > max.length()) {
                max = s1;
            }
            if (s2.length() > max.length()) {
                max = s2;
            }

        }
        return max;
    }

    static String extend(String s, int start, int end) {
        String ret = "";
        while (start >= 0 && end < s.length()) {
            if (s.charAt(start) == s.charAt(end)) {
                start--;
                end++;
            } else {
                break;
            }
        }
        ret = s.substring(start + 1, end);
        return ret;
    }
}
