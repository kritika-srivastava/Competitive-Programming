/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Day-4/Trailing_zeros.java
 * 
 * @author Kritika Srivastava
 * @since May 30, 2021
 *
 *        Description - Given an integer n, return the number of trailing zeroes
 *        in n!. Link - https://leetcode.com/problems/factorial-trailing-zeroes/
 */
public class Trailing_zeros {
    public int trailingZeroes(int n) {
        int ret = 0;
        for (int i = 5; i <= n; i = i * 5) {
            ret = ret + (n / i);
        }
        return ret;
    }
}
