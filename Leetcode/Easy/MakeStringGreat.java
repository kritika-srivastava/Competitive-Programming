package Leetcode.Easy;
/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\MakeStringGreat.java
 * @author Kritika Srivastava
 * @since December 19, 2024
 *
 * Link: https://leetcode.com/problems/make-the-string-great/description/
 */
public class MakeStringGreat {
    public String makeGood(String s) {
        while (!isGood(s)) {
            s = makeGoodString(s);
        }

        return s;
    }

    static boolean isGood(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (((s.charAt(i) == Character.toLowerCase(s.charAt(i - 1)) && !(s.charAt(i) == s.charAt(i - 1))))
                    || ((s.charAt(i - 1) == Character.toLowerCase(s.charAt(i))) && !(s.charAt(i) == s.charAt(i - 1)))) {
                return false;
            }
        }
        return true;
    }

    static String makeGoodString(String s) {
        String ans = "";
        int max = 0;
        for (int i = 1; i <= s.length(); i++) {

            if (i == s.length()) {
                ans += s.charAt(i - 1);
            } else if (((s.charAt(i) == Character.toLowerCase(s.charAt(i - 1)) && !(s.charAt(i) == s.charAt(i - 1))))
                    || ((s.charAt(i - 1) == Character.toLowerCase(s.charAt(i))) && !(s.charAt(i) == s.charAt(i - 1)))) {
                i++;
            } else {
                ans += s.charAt(i - 1);
                max = i - 1;
            }
        }

        return ans;
    }
}
