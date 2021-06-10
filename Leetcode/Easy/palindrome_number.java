/**
 * ~/Desktop/Competitive-Coding/Leetcode/Easy/palindrome_number.java
 * 
 * @author Kritika Srivastava
 * @since June 10, 2021
 *
 *        Description - Given an integer x, return true if x is palindrome
 *        integer.An integer is a palindrome when it reads the same backward as
 *        forward. For example, 121 is palindrome while 123 is not. Link -
 *        https://leetcode.com/problems/palindrome-number/description/
 */
class palindrome_number {
    public boolean isPalindrome(int x) {
        String st = Integer.toString(x);
        StringBuffer sb = new StringBuffer(st);
        sb.reverse();
        String s = new String(sb);
        if (s.equals(st)) {
            return true;
        } else {
            return false;
        }

    }
}
// @lc code=end
