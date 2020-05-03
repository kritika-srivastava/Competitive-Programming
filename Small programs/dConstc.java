public class dConstc {
    int a, b;

    dConstc() {
        a = 5;
        b = 8;
    }

    void display() {
        System.out.print("Value of a = " + a + "  Value of b=" + b);
    }
}

class Abc {
    public static void main(String aArgs[]) {
        dConstp OB = new dConstp();
        OB.display();
    }
}