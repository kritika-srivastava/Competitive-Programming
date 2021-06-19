/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/repeated_substring_pattern.java
 * 
 * @author Kritika Srivastava
 * @since June 19, 2021
 *
 *        Description - Given a string s, check if it can be constructed by
 *        taking a substring of it and appending multiple copies of the
 *        substring together.
 * 
 *        Link - https://leetcode.com/problems/repeated-substring-pattern/
 */
public class repeated_substring_pattern {
    public static boolean repeatedSubstringPattern(String s) {
        if (s.length() < 2) {
            return false;
        }
        String copy = "";
        for (int i = 1; i < s.length(); i++) {
            if (s.substring(i).startsWith(s.substring(0, i))) {
                if (s.length() % (i) == 0) {
                    copy = s.substring(0, i);
                    String str = "";
                    while (str.length() < s.length()) {
                        str = str + copy;
                    }
                    if (str.equals(s)) {
                        return true;
                    }
                } else {
                }
            }
        }
        return false;
    }
}
