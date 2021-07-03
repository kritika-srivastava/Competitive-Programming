/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/find_minimum_in_rotated_sorted_array.java
 * 
 * @author Kritika Srivastava
 * @since July 03, 2021
 *
 *        Link -
 *        https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 */
public class find_minimum_in_rotated_sorted_array {
    public int findMin(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        int lo = 0, hi = arr.length - 1;

        if (arr[arr.length - 1] > arr[0]) {
            return arr[0];
        }
        while (hi >= lo) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] > arr[mid + 1]) {
                return arr[mid + 1];
            }

            if (arr[mid - 1] > arr[mid]) {
                return arr[mid];
            }

            if (arr[mid] > arr[0]) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }

        }
        return -1;
    }
}
