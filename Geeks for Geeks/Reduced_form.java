/**
 * /mnt/e/#Fod Do/Target 450/Main.java
 * @author Kritika Srivastava
 * @since April 28, 2021
 *
 * Convert Array to reduced form
 * Link - https://practice.geeksforgeeks.org/problems/convert-an-array-to-reduced-form1101/1
 */
import java.util.*;
import java.io.*;

public class Reduced_form {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().convert(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

class Solution {
    void convert(int[] arr, int n) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = arr[i];
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < n; i++) {
            arr[i] = map.get(a[i]);
        }
    }
}
