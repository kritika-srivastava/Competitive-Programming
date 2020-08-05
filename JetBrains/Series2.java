/*
Given the number n, not exceeding 10, and a matrix of size n × n.

Check whether this matrix is symmetric in relation to the main diagonal. Output the word “YES”, if it is symmetric and the word “NO” otherwise.

Sample Input 1:

3
0 1 2
1 2 3
2 3 4

Sample Output 1:

YES
*/

import java.util.Scanner;
class Series2 {
    public static void main(String[] args) {
        // put your code here
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String out = "YES";
        int[][] a = new int[n][n];
        for(int i = 0; i < n; i++) {
             for(int j = 0; j < n;j++) {
                 a[i][j]=kb.nextInt();
             }
        }
        for(int i = 0; i < n; i++) {
             for(int j = 0; j < n;j++) {
                
                 if (a[i][j] == a[j][i]) {
                 }
                 else {
                 out = "NO";break;}
             }
             if(out.equals("NO") == true)
             {break;}
             else{}
             
        }
        System.out.println(out);
    }
}
