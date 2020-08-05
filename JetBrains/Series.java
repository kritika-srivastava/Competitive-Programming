/*
Given the number n, not greater than 100, create the matrix of size n×n and fill it using the following rule. Numbers 0 should be stored on the primary (main) diagonal. The two diagonals, adjacent to the primary one, should contain numbers 1. The next two diagonals should contain numbers 2; etc.

Note: the primary diagonal runs from the top left corner to the bottom right corner.

Sample Input 1:

5

Sample Output 1:

0 1 2 3 4
1 0 1 2 3
2 1 0 1 2
3 2 1 0 1
4 3 2 1 0

*/

import java.util.Scanner;
class Series {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
                if (i == j) { 
                    System.out.print("0 ");}
                else if (j < i) { 
                    System.out.print((i-j)+" ");}
                else if (j > i) { 
                    System.out.print((j-i)+" "); }
                else { 
                }
            }
            System.out.println();
        }
        
    }
}
