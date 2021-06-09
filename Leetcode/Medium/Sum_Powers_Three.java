/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/Sum_Powers_Three.java
 * 
 * @author Kritika Srivastava
 * @since June 09, 2021
 *
 *        Description - Given an integer n, return true if it is possible to
 *        represent n as the sum of distinct powers of three. Otherwise, return
 *        false. Link -
 *        https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/
 */
class Sum_Powers_Three {
    public boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) {
                return false;
            } else {
                n /= 3;
            }

        }
        return true;
    }
}