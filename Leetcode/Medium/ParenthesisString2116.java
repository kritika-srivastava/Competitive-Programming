/**
 * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\ParenthesisString2116.java
 * @author Kritika Srivastava
 * @since January 12, 2025
 *
 * Link: https://leetcode.com/problems/check-if-a-parentheses-string-can-be-valid/
 */
public class ParenthesisString2116 {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        if (n % 2 != 0) {
            return false;
        }

        int minOpen = 0;
        int maxOpen = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            char lock = locked.charAt(i);

            if (lock == '0') {
                minOpen = Math.max(0, minOpen - 1);
                maxOpen++;
            } else {
                if (ch == '(') {
                    minOpen++;
                    maxOpen++;
                } else {
                    minOpen = Math.max(0, minOpen - 1);
                    maxOpen--;
                }
            }

            if (maxOpen < 0) {
                return false;
            }
        }

        return minOpen == 0;
    }
}
