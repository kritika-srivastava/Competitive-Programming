package Leetcode.Easy;

/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Easy\ClearDigits.java
 * 
 * @author Kritika Srivastava
 * @since February 10, 2025
 *
 *        Link: https://leetcode.com/problems/clear-digits
 */
public class ClearDigits {

    public String clearDigits(String s) {
        boolean containsDigits = true;
        int count = 0, initialLength = 0;
        while (containsDigits) {
            count = 0;
            initialLength = s.length();
            loop: for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    s = s.substring(0, i - 1) + s.substring(i + 1);
                    // System.out.println(s);
                    i = 0;
                    continue loop;
                } else {
                    count++;
                }
            }

            if (count == initialLength) {
                containsDigits = false;
            }
        }
        return s;
    }
}