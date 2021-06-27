/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/binary_number_alternating_bits.java
 * 
 * @author Kritika Srivastava
 * @since June 27, 2021
 *
 *        Description - Given a positive integer, check whether it has
 *        alternating bits: namely, if two adjacent bits will always have
 *        different values.
 * 
 *        Link -
 *        https://leetcode.com/problems/binary-number-with-alternating-bits/
 */
public class binary_number_alternating_bits {
    public boolean hasAlternatingBits(int n) {
        String s = Integer.toString(n, 2);
        boolean ret = true;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                ret = false;
                break;
            } else {
            }

        }
        return ret;
    }
}
