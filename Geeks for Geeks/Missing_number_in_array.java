/**
 * ~/Documents/Drive-E/GitHub/Competitive-Coding/Geeks for
 * Geeks/Missing_number_in_array.java
 * 
 * @author Kritika Srivastava
 * @since July 03, 2021
 *
 *        Link -
 *        https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1
 */
class Missing_number_in_array {
    // Function to find missing number
    static int getMissingNo(int a[], int n)
    {
        int x1 = a[0];
        int x2 = 1;

        for (int i = 1; i < n; i++)
            x1 = x1 ^ a[i];

        for (int i = 2; i <= n + 1; i++)
            x2 = x2 ^ i;

        return (x1 ^ x2);
    }