import java.util.Scanner;

public class Combine {
    public int com1[] = new int[100];
    public int com2[] = new int[100];
    public int com3[] = new int[100];
    public int size = 0;

    Combine(int m) {
        size = m;
    }

    public void inputarray() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter first " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            com1[i] = kb.nextInt();
        }
        System.out.println("Enter last " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            com2[i] = kb.nextInt();
        }
    }

    public void mix() {
        for (int i = 0; i < size; i++) {
            com3[i] = com1[i];
        }
        int a = (2 * size);
        for (int i = size; i < a; i++) {
            com3[i] = com2[i - size];
        }
    }

    public void display() {
        System.out.println("The no's merged are:");
        for (int i = 0; i < (2 * size); i++) {
            System.out.println(com3[i]);
        }
    }

    public static void main(String Args[]) {
        System.out.println("Enter size of array");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        Combine ob = new Combine(size);
        ob.inputarray();
        ob.mix();
        ob.display();
    }
}
