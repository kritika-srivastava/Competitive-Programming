/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/length_of_last_word.java
 * 
 * @author Kritika Srivastava
 * @since June 24, 2021
 *
 *        Description - Given a string s consists of some words separated by
 *        spaces, return the length of the last word in the string. If the last
 *        word does not exist, return 0. A word is a maximal substring
 *        consisting of non-space characters only.
 * 
 *        Link - https://leetcode.com/problems/length-of-last-word/
 */
public class length_of_last_word {

    public int lengthOfLastWord(String s) {
        String[] st = s.split(" ");
        if (st.length > 0)
            return st[st.length - 1].length();

        return 0;
    }
}
