/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/Max_Cake_Area.java
 * 
 * @author Kritika Srivastava
 * @since June 03, 2021
 *
 *        Description - Given a rectangular cake with height h and width w, and
 *        two arrays of integers horizontalCuts and verticalCuts where
 *        horizontalCuts[i] is the distance from the top of the rectangular cake
 *        to the ith horizontal cut and similarly, verticalCuts[j] is the
 *        distance from the left of the rectangular cake to the jth vertical
 *        cut.
 * 
 *        Return the maximum area of a piece of cake after you cut at each
 *        horizontal and vertical position provided in the arrays horizontalCuts
 *        and verticalCuts. Since the answer can be a huge number, return this
 *        modulo 10^9 + 7.
 * 
 *        Link -
 *        https://leetcode.com/problems/maximum-area-of-a-piece-of-cake-after-horizontal-and-vertical-cuts/
 */
class Max_Cake_Area {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {

        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        int prev_x = 0, prev_y = 0;

        for (int i = 1; i < horizontalCuts.length; i++) {
            prev_x = Math.max(prev_x, horizontalCuts[i] - horizontalCuts[i - 1]);
        }

        prev_x = Math.max(prev_x, horizontalCuts[0] - 0);
        prev_x = Math.max(prev_x, h - horizontalCuts[horizontalCuts.length - 1]);

        for (int i = 1; i < verticalCuts.length; i++) {
            prev_y = Math.max(prev_y, verticalCuts[i] - verticalCuts[i - 1]);
        }

        prev_y = Math.max(prev_y, verticalCuts[0] - 0);
        prev_y = Math.max(prev_y, w - verticalCuts[verticalCuts.length - 1]);

        long ret = (1L * prev_x * prev_y) % 1000000007;
        return (int) ret;
    }
}
