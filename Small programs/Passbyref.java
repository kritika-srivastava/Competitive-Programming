public class Passbyref {
    void add(int x[]) {
        int i, l = x.length;
        for (i = 0; i <= 1; i++)
            x[i] = x[i] + 2;
        System.out.println("Para after change");
        for (i = 0; i <= 1; i++)
            System.out.print(x[i] + "\t");
        System.out.println();
    }

    public static void main(String Args[]) {
        int a[] = { 2, 4, 8, 6, 15 };
        Passbyref OB = new Passbyref();
        OB.add(a);
        System.out.println("Formal argument after fun operation");
        for (int j = 0; j < a.length; j++)
            System.out.print(a[j] + "\t");
    }
}