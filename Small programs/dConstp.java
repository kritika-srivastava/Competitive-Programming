public class dConstp {
    int a, b;

    dConstp() {
        a = 0;
        b = 0;
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