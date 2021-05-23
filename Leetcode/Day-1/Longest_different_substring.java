/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Day-1/Longest_different_substring.java
 * 
 * @author Kritika Srivastava
 * @since May 23, 2021
 *
 *        Description - Given a string s, find the length of the longest
 *        substring without repeating characters.
 * 
 *        Link -
 *        https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class Longest_different_substring {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int max = 0, start = 0, curr = 0;
        String a = "";
        for (int i = 0; i < s.length(); i++) {
            if (a.contains(Character.toString(s.charAt(i))) == true) {
                max = Math.max(max, curr);
                start = s.substring(0, i).lastIndexOf(s.charAt(i)) + 1;
                a = s.substring(start, i + 1);
                curr = a.length();
            } else {
                curr++;
                max = Math.max(max, curr);
                a = s.substring(start, i + 1);
            }
        }
        return max;
    }
}
