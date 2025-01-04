package Leetcode.Leetcode @75;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Leetcode@75\GCD.java
 * @author Kritika Srivastava
 * @since January 03, 2025
 *
 * Link: https://leetcode.com/problems/greatest-common-divisor-of-strings
 */
public class GCD {
    public String gcdOfStrings(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return gcdOfStrings(str2, str1);
        }
        int n = str2.length(), i = 1;
        String ans = "";
        while (i <= n) {
            String gcd = str2.substring(0, i);
            if (isValid(str1, gcd) && isValid(str2, gcd)) {
                ans = gcd;
            }

            i++;
        }

        return ans;
    }

    static boolean isValid(String s, String t) {
        String temp = t;
        while (temp.length() < s.length()) {
            temp += t;
        }

        if (temp.equals(s)) {
            return true;
        }

        return false;
    }
}
