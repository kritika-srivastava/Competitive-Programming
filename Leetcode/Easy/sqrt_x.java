/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/sqrt_x.java
 * 
 * @author Kritika Srivastava
 * @since June 27, 2021
 *
 *        Description - Given a non-negative integer x, compute and return the
 *        square root of x. Since the return type is an integer, the decimal
 *        digits are truncated, and only the integer part of the result is
 *        returned. Note: You are not allowed to use any built-in exponent
 *        function or operator, such as pow(x, 0.5) or x ** 0.5.
 * 
 *        Link - https://leetcode.com/problems/sqrtx/
 */
public class sqrt_x {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int lb = 1, ub = x;
        int mid = lb + (ub - lb) / 2;
        while (lb < ub) {
            mid = lb + (ub - lb) / 2;
            if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
                return mid;
            } else if (mid < x / mid) {
                lb = mid + 1;
            } else {
                ub = mid;
            }
        }
        return lb;
    }
}
