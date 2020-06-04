
import java.util.Scanner;

public class Soln {
    static void climbingLeaderboard(int[] scores, int[] alice) {
        int a[] = new int[alice.length];
        int k = 1, tmp = scores[0];
        int rank[] = new int[scores.length];
        for (int j = 0; j < scores.length; j++) {
            if (j == 0) {
                rank[j] = k;
            } else if (tmp == scores[j]) {
                rank[j] = k;
            } else {
                k++;
                tmp = scores[j];
                rank[j] = k;
            }
        }
        tmp = a[0];
        for (int i = 0; i < alice.length; i++) {
            for (int j = 0; j < scores.length; j++) {
                if (scores[j] <= alice[i]) {
                    a[i] = rank[j];
                    break;
                }
            }
            if (a[i] == 0) {
                a[i] = rank[rank.length - 1] + 1;
            }
        }
        for (int i = 0; i < alice.length; i++) {
            System.out.println(a[i]);
        }

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int l1 = kb.nextInt();
        int scores[] = new int[l1];
        for (int i = 0; i < l1; i++) {
            scores[i] = kb.nextInt();
        }

        int l2 = kb.nextInt();
        int alice[] = new int[l2];
        for (int i = 0; i < l2; i++) {
            alice[i] = kb.nextInt();
        }
        climbingLeaderboard(scores, alice);
    }
}
