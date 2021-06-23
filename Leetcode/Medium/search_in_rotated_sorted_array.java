
/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/search_in_rotated_sorted_array.java
 * @author Kritika Srivastava
 * @since June 23, 2021
 *
 * Description - There is an integer array nums sorted in ascending order (with distinct values). 
 * Prior to being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) 
 * such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
 * For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2]. Given the array nums after 
 * the rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums. You must 
 * write an algorithm with O(log n) runtime complexity.
 * 
 * Link - https://leetcode.com/problems/search-in-rotated-sorted-array/
 */
import java.util.Scanner;

public class search_in_rotated_sorted_array {
    static int search(int[] nums, int target) {
        int lb = 0;
        int ub = nums.length - 1;
        while (lb <= ub) {
            int mid = (lb + ub) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[lb] <= nums[mid]) {
                if (target < nums[mid] && target >= nums[lb]) {
                    ub = mid - 1;
                } else {
                    lb = mid + 1;
                }
            }
            if (nums[mid] <= nums[ub]) {
                if (target > nums[mid] && target <= nums[ub]) {
                    lb = mid + 1;
                } else {

                    ub = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        int nn = kb.nextInt();
        System.out.println(search(a, nn));
    }
}
