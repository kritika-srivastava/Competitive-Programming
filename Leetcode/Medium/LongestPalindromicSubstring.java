/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\LongestPalindromicSubstring.java
 * @author Kritika Srivastava
 * @since December 20, 2024
 *
 * Link - https://leetcode.com/problems/longest-palindromic-substring/
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int len = 0;
        String ans = "";
        for (int i = 0; i <= s.length(); i++) {
            int len1 = palindrome(s, i, i);
            int len2 = palindrome(s, i, i + 1);

            if (len1 > len && len1 > len2) {
                len = len1;
                ans = s.substring(i - (len1 - 1) / 2, i + len1 / 2 + 1);
            }

            if (len2 > len && len2 > len1) {
                len = len2;
                ans = s.substring(i - (len2 - 1) / 2, i + len2 / 2 + 1);
            }

            // System.out.println(len1+" "+len2+" "+ans);

        }
        return ans;

    }

    static int palindrome(String s, int left, int right) {

        int count = 0;

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        count = right - left - 1;

        return count;
    }
}
