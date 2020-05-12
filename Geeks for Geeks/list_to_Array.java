import java.util.*;
import java.util.Scanner;

public class list_to_Array {
    public static void main(String Args[]) {
        int m = 0;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        LinkedList<Integer> ob = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            m = kb.nextInt();
            ob.add(m);
        }
        System.out.println("List:");
        System.out.println(ob + " ");
        kb.close();
        System.exit(0); 
    }

}