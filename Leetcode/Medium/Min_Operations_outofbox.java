/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/Min_Operations_outofbox.java
 * 
 * @author Kritika Srivastava
 * @since July 02, 2021
 *
 *        Link -
 *        https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/
 */
public class Min_Operations_outofbox {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ret = new int[n];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (boxes.charAt(j) == '1') {
                    ret[i] += Math.abs(i - j);
                }
            }
        }
        return ret;
    }
}
