/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/Reverse_String_2.java
 * 
 * @author Kritika Srivastava
 * @since June 19, 2021
 *
 *        Description - Given a string s and an integer k, reverse the first k
 *        characters for every 2k characters counting from the start of the
 *        string. If there are fewer than k characters left, reverse all of
 *        them. If there are less than 2k but greater than or equal to k
 *        characters, then reverse the first k characters and left the other as
 *        original.
 * 
 *        Link - https://leetcode.com/problems/reverse-string-ii/
 */
public class Reverse_String_2 {

    public static String reverseStr(String s, int k) {
        int m = 0;

        for (int i = 0; i < s.length(); m++, i += k) {
            if (m % 2 == 0) {
                if (i + k <= s.length()) {
                    String st = s.substring(i, i + k);
                    StringBuffer sb = new StringBuffer(st);
                    sb.reverse();
                    st = new String(sb);
                    s = s.substring(0, i) + st + s.substring(i + k);
                } else {
                    String st = s.substring(i);
                    StringBuffer sb = new StringBuffer(st);
                    sb.reverse();
                    st = new String(sb);
                    s = s.substring(0, i) + st;
                }

            } else {
            }
        }
        return s;
    }
}
