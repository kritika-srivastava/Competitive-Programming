/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/heaters.java
 * 
 * @author Kritika Srivastava
 * @since June 27, 2021
 *
 *        Description - Winter is coming! During the contest, your first job is
 *        to design a standard heater with a fixed warm radius to warm all the
 *        houses. Every house can be warmed, as long as the house is within the
 *        heater's warm radius range. Given the positions of houses and heaters
 *        on a horizontal line, return the minimum radius standard of heaters so
 *        that those heaters could cover all houses. Notice that all the heaters
 *        follow your radius standard, and the warm radius will the same.
 * 
 *        Link - https://leetcode.com/problems/heaters/
 */
public class heaters {
    public int findRadius(int[] houses, int[] heaters) {
        int min[] = new int[houses.length];
        for (int i = 0; i < houses.length; i++) {
            min[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < houses.length; i++) {
            for (int j = 0; j < heaters.length; j++) {
                min[i] = Math.min(min[i], Math.abs(heaters[j] - houses[i]));
            }
        }
        int max = 0;
        for (int i = 0; i < houses.length; i++) {
            max = Math.max(min[i], max);
        }
        return max;

    }
}
