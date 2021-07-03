/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/find_the_duplicate_number.java
 * 
 * @author Kritika Srivastava
 * @since July 03, 2021
 *
 *        Link - https://leetcode.com/problems/find-the-duplicate-number/
 */
public class find_the_duplicate_number {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];

        }

        return slow;
    }
}
