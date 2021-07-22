/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Geeks for Geeks/PhoneDigit.java
 * @author Kritika Srivastava
 * @since July 22, 2021
 *
 * Link - https://practice.geeksforgeeks.org/problems/possible-words-from-phone-digits-1587115620/1/
 */
// { Driver Code Starts
//Initial Template for Java

import java.util.*;

class PhoneDigit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();// testcases

        while (t-- > 0) {
            int n = sc.nextInt(); // input size of array
            int arr[] = new int[n]; // input the elements of array that are keys to be pressed

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();// input the elements of array that are keys to be pressed
            ArrayList<String> res = new Solution().possibleWords(arr, n);
            for (String i : res)
                System.out.print(i + " ");
            System.out.println();

        }
    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
    // Function to find list of all words possible by pressing given numbers.
    static ArrayList<String> possibleWords(int a[], int N) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

        ArrayList<String> l = new ArrayList<String>();
        backtrack("", l, map, a, N, 0);
        return l;
    }

    static void backtrack(String s, ArrayList<String> l, Map<Integer, String> map, int[] a, int N, int j) {
        if (s.length() == N) {
            l.add(s);
        } else {
            for (int i = 0; i < map.get(a[j]).length(); i++) {
                s += map.get(a[j]).charAt(i);
                j++;
                backtrack(s, l, map, a, N, j);
                j--;
                s = s.substring(0, s.length() - 1);
            }
        }
    }
}
