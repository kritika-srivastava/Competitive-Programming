
/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/majority_element.java
 * @author Kritika Srivastava
 * @since June 20, 2021
 *
 * Description - Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times. 
 * You may assume that the majority element always exists in the array. 
 * Link - https://leetcode.com/problems/majority-element/
 */
import java.util.*;

class majority_element {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int max = 1, curr = 1, ret = nums[0];
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                curr++;
            } else {
                curr = 1;
            }

            if (curr > max) {
                max = curr;
                ret = nums[i];
            } else {
            }
        }
        return ret;
    }
}