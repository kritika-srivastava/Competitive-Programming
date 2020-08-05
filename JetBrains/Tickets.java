/*
The cinema has n rows, each row consists of m seats (n and m do not exceed 20). The two-dimensional matrix stores the information on the sold tickets, number 1 means that the ticket for this place is already sold, the number 0 means that the place is available. You want to buy k tickets to the neighboring seats in the same row. Find whether it can be done.

Input data format

On the input, the program gets the number of n rows and m seats. Then, there are n lines, each containing m numbers (0 or 1) separated by spaces. The last line contains a number k.

Output data format

The program should output the number of the row with k consecutive available seats. If there are several rows with k available seats, output the first row with these seats. If there is no such a row, output the number 0.

Sample Input 1:

3 4
0 1 0 1
1 1 0 1
1 0 0 1
2

Sample Output 1:

3
 Sample Input 2:

3 3
0 1 0
1 0 0
1 1 1
3

Sample Output 2:

0
*/
import java.util.Scanner;

class Tickets {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int m = kb.nextInt();
    int n = kb.nextInt();
    int a[][] = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        a[i][j] = kb.nextInt();
      }
    }
    int k = kb.nextInt();
    int l = 0, x = 0;
    for (int i = 0; i < m; i++) {
      l = 0;
      for (int j = 0; j < n; j++) {
        if (a[i][j] == 0) {
          l++;
          if (l == k) {
            x = i + 1;
            break;
          } else {}
        } else if (a[i][j] == 1) {
          l = 0;
        } else {}
      }
      if (x != 0) {
        break;
      } else {}
    }
    System.out.println(x);
  }
}
