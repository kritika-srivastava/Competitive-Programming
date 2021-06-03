/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Day-2/Reverse_Number.java
 * @author Kritika Srivastava
 * @since May 24, 2021
 * Description - Given a signed 32-bit integer x, return x with its digits reversed. 
 * If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], 
 * then return 0.
 * 
 * Link - https://leetcode.com/problems/reverse-integer/
 */
class Reverse_number {
    public int reverse(int x) {
        long y = 0;
        while (x != 0) {
            y *= 10;
            y += x % 10;
            x /= 10;
        }
        if ((y > (int) Math.pow(2, 31) - 1) || (y < (-(int) Math.pow(2, 31)))) {
            return 0;
        }
        return (int) y;
    }
}