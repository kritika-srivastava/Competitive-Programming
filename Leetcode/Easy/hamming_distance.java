/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/hamming_distance.java
 * 
 * @author Kritika Srivastava
 * @since June 27, 2021
 *
 *        Description - The Hamming distance between two integers is the number
 *        of positions at which the corresponding bits are different. Given two
 *        integers x and y, return the Hamming distance between them.
 * 
 *        Link - https://leetcode.com/problems/hamming-distance/
 */
public class hamming_distance {
    public int hammingDistance(int x, int y) {
        int ret = 0;
        String s = Integer.toString(x ^ y, 2);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ret++;
            }
        }
        return ret;

    }
}
