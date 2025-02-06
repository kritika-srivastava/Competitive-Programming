package Leetcode.Medium;

import java.util.*;

public class TupleWithSameProduct {
    /**
     * E:\GithubProjects\Competitive-Programming\Leetcode\Medium\TupleWithSameProduct.java
     * 
     * @author Kritika Srivastava
     * @since February 06, 2025
     *
     *        Link: https://leetcode.com/problems/tuple-with-same-product/
     */
    // @lc code=start

    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, ArrayList<int[]>> map = new HashMap<>();
        int n = nums.length, ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (!map.containsKey(nums[i] * nums[j])) {
                    ArrayList<int[]> list = new ArrayList<>();
                    list.add(new int[] { nums[i], nums[j] });
                    map.put(nums[i] * nums[j], list);
                } else {
                    ArrayList<int[]> list = map.get(nums[i] * nums[j]);
                    list.add(new int[] { nums[i], nums[j] });
                    map.replace(nums[i] * nums[j], list);
                }
            }
        }

        for (int key : map.keySet()) {
            ArrayList<int[]> list = map.get(key);

            if (list.size() > 1) {
                int len = list.size();
                if (len == 2) {
                    ans += 8 * 1;
                } else {
                    ans += 8 * (len * (len - 1) / 2);
                }
            }
        }
        return ans;
    }
}
// @lc code=end
