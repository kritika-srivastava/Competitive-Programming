class Passbyvalue {
    void show(int X, int Y) {
        X = X + 2;
        Y = Y + 2;
        System.out.println("Formal parameter after function operation " + X + "," + Y);
    }

    public static void main(String Args[]) {
        Passbyvalue OB = new Passbyvalue();
        int a = 5, b = 6;
        OB.show(a, b);
        System.out.println("Actual or after function operation" + a + "," + b);
    }
}