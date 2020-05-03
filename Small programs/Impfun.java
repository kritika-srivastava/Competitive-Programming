class Impfun {
    int a;
    int b;
    int c;

    Impfun(int m) {
        a = m;
        b = 0;
        c = 0;
    }

    void seta() {
        b += a;
    }

    void setc() {
        c = c + b;

        System.out.println("The value of c = " + c);
    }
}
