
/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Geeks for Geeks/Next_greater_element.java
 * @author Kritika Srivastava
 * @since August 04, 2021
 *
 * Link - https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1#
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String inputLine[] = br.readLine().trim().split(" ");
            long[] arr = new long[n];
            for (int i = 0; i < n; i++)
                arr[i] = Long.parseLong(inputLine[i]);
            long[] res = new Solution().nextLargerElement(arr, n);
            for (int i = 0; i < n; i++)
                System.out.print(res[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends

class Solution {
    // Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n) {
        long[] a = new long[n];
        Stack<Long> st = new Stack<Long>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (st.isEmpty()) {
                a[i] = -1;
                st.push(arr[i]);
            } else {
                if (st.peek() > arr[i]) {
                    a[i] = st.peek();
                    st.push(arr[i]);
                } else {
                    while (true) {
                        if (st.isEmpty()) {
                            a[i] = -1;
                            st.push(arr[i]);
                            break;
                        } else if (st.peek() > arr[i]) {
                            a[i] = st.peek();
                            st.push(arr[i]);
                            break;
                        } else {
                            st.pop();
                        }
                    }
                }
            }
        }

        return a;
    }
}