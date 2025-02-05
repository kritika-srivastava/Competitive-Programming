package Leetcode.Easy;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Easy\CheckIfOneStringSwapCanMakeStringsEqual.java
 * @author Kritika Srivastava
 * @since February 05, 2025
 *
 * Link: https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/
 */
public class CheckIfOneStringSwapCanMakeStringsEqual {

    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }

        int prev = -1;
        boolean found = false, flag = true;
        for (int i = 0; i < s1.length(); i++) {

            // 1st different occurence of characters when answer is not found
            if (s1.charAt(i) != s2.charAt(i) && flag && !found) {
                prev = i;
                flag = false;
                // 2nd different occurence of characters when answer is not found
            } else if (s1.charAt(i) != s2.charAt(i) && !flag && !found) {
                /*
                 * if characters can be swapped to make string identical -> answer found
                 * else the strings s1 and s2 contain different characters and can never be the
                 * same
                 */
                if (s1.charAt(prev) == s2.charAt(i) && s2.charAt(prev) == s1.charAt(i)) {
                    found = true;
                } else {
                    return false;
                }
                // if answer has been found but there is another occurence of different
                // characters -> 1 swap criteria failed -> return false
            } else if (s1.charAt(i) != s2.charAt(i) && found) {
                return false;
            }
        }

        return found;
    }
}
