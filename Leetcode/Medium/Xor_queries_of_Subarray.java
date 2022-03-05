/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Leetcode/Medium/Xor_queries_of_Subarray.java
 * @author Kritika Srivastava
 * @since March 05, 2022
 *
 * Description - You are given an array arr of positive integers. You are also given the array queries where queries[i] = [lefti, righti].
 * For each query i compute the XOR of elements from lefti to righti (that is, arr[lefti] XOR arr[lefti + 1] XOR ... XOR arr[righti] ).
 * Return an array answer where answer[i] is the answer to the ith query.
 * Link - https://leetcode.com/problems/xor-queries-of-a-subarray/
 */
class Xor_queries_of_Subarray {

  public int[] xorQueries(int[] arr, int[][] queries) {
    int ret[] = new int[queries.length];
    int pre[] = new int[arr.length];
    for (int i = 0; i < pre.length; i++) {
      if (i == 0) {
        pre[i] = arr[i];
      } else {
        pre[i] = arr[i] ^ pre[i - 1];
      }
    }

    for (int i = 0; i < queries.length; i++) {
      if (queries[i][0] == queries[i][1]) {
        ret[i] = arr[queries[i][1]];
      } else if (queries[i][0] == 0) {
        ret[i] = pre[queries[i][1]];
      } else {
        ret[i] = pre[queries[i][0] - 1] ^ pre[queries[i][1]];
      }
    }

    return ret;
  }
}
