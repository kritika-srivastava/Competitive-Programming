
/**
 * E:\#Fod Do\Target 450\Codes\q440.java
 * @author Kritika Srivastava
 * @since March 19, 2021
 *
 * Non-repeating Numbers
 * Link - https://practice.geeksforgeeks.org/problems/finding-the-numbers0215/1#
 */
import java.util.*;
import java.io.*;

class q440 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[2 * n + 2];
            for (int i = 0; i < 2 * n + 2; i++) {
                v[i] = Integer.parseInt(S[i]);
            }
            int[] ans = singleNumber(v);
            for (int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }

    static int[] singleNumber(int[] nums) {
        int a[] = new int[2];
        int x = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1;) {
            if (nums[i] == nums[i + 1]) {
                i += 2;
            } else {
                a[x] = nums[i];
                x++;
                i++;
            }
        }
        if (nums[nums.length - 1] != nums[nums.length - 2]) {
            a[x] = nums[nums.length - 1];
        } else {
        }
        return a;
    }
}
