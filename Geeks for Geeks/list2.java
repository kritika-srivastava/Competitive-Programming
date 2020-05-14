
/*a program to traverse and concentate two linked list
Also to pairwise exchange adjacent elements of a linked list*/
import java.util.*;
import java.util.Scanner;

public class list2 {

    public static void main(String Args[]) {

        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the first 5 List Elements:");
        for (int i = 0; i < 5; i++) {
            int m = kb.nextInt();
            list.add(m);
        }

        LinkedList<Integer> list2 = new LinkedList<Integer>();
        System.out.println("Enter the last 5 list Elements:");

        for (int i = 0; i < 5; i++) {
            int m = kb.nextInt();
            list2.add(m);
            list.add(list2.get(i));
        }

        System.out.println("List:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (int i = 0; i < list.size() - 1; i++) {
            int t = list.get(i);
            list.set(i, list.get(i + 1));
            list.set((i + 1), t);
            i++;
        }
        System.out.println("List after modification:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        kb.close();
    }
}