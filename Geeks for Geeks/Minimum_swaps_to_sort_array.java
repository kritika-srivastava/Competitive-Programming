
/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Geeks for Geeks/Minimum_swaps_to_sort_array.java
 * @author Kritika Srivastava
 * @since July 28, 2021
 *
 * Link - https://practice.geeksforgeeks.org/problems/minimum-swaps/1
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends

class Solution {
    // Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[]) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {

            int pos = i, min = nums[i];
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    pos = j;
                }
            }
            if (i != pos) {
                int t = nums[i];
                nums[i] = nums[pos];
                nums[pos] = t;
                k++;
            }
        }
        return k;
    }
}