/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/missing_number.java
 * 
 * @author Kritika Srivastava
 * @since June 27, 2021
 *
 *        Description - Given an array nums containing n distinct numbers in the
 *        range [0, n], return the only number in the range that is missing from
 *        the array. Follow up: Could you implement a solution using only O(1)
 *        extra space complexity and O(n) runtime complexity?
 * 
 *        Link - https://leetcode.com/problems/missing-number/
 */
public class missing_number {
    public int missingNumber(int[] nums) {
        int sum = ((nums.length) * (nums.length + 1)) / 2;
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum2 += nums[i];
        }
        return (sum - sum2);
    }
}
