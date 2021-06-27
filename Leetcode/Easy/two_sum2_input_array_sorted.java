/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Easy/two_sum2_input_array_sorted.java
 * 
 * @author Kritika Srivastava
 * @since June 27, 2021
 *
 *        Description - Given an array of integers numbers that is already
 *        sorted in non-decreasing order, find two numbers such that they add up
 *        to a specific target number.
 * 
 *        Link - https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * 
 *        Complexity - O(n)
 */
public class two_sum2_input_array_sorted {
    public int[] twoSum(int[] numbers, int target) {
        int lb = 0, ub = numbers.length - 1;
        int a[] = new int[2];
        while (lb < ub) {
            if (numbers[lb] + numbers[ub] == target) {
                a[0] = lb + 1;
                a[1] = ub + 1;
                break;
            } else if (numbers[lb] + numbers[ub] > target) {
                ub--;
            } else {
                lb++;
            }
        }
        return a;
    }
}
