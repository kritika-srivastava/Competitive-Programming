
/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Day-4/Consecutive_Stones.java
 * @author Kritika Srivastava
 * @since May 30, 2021
 *
 * Description - Three stones are on a number line at positions a, b, and c.
 * Each turn, you pick up a stone at an endpoint (ie., either the lowest or highest position stone), 
 * and move it to an unoccupied position between those endpoints.  
 * 
 * Formally, let's say the stones are currently at positions x, y, z with x < y < z.  You pick up the stone
 * at either position x or position z, and move that stone to an integer position k, with x < k < z and k != y.
 * The game ends when you cannot make any more moves, ie. the stones are in consecutive positions.
 * When the game ends, what is the minimum and maximum number of moves that you could have made?  
 * Return the answer as an length 2 array: answer = [minimum_moves, maximum_moves]
 * 
 * Link - https://leetcode.com/problems/moving-stones-until-consecutive/
 */

import java.util.*;

public class Consecutive_Stones {
    public int[] numMovesStones(int A, int b, int c) {
        int a[] = { A, b, c };
        Arrays.sort(a);
        int min = 0, max = 0;
        if (a[1] - a[0] > 1) {
            min += 1;
            max += a[1] - a[0] - 1;
        } else {
        }
        if (a[2] - a[1] > 1) {
            min += 1;
            max += a[2] - a[1] - 1;
        } else {
        }

        if (a[2] - a[1] == 2 || a[1] - a[0] == 2) {
            min = 1;
        } else {
        }
        System.out.println(min);

        int B[] = { min, max };
        return B;
    }
}