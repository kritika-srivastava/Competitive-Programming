public class Calculator {
    private int result;

    Calculator() {
        result = 0;
    }

    void add(int a) {
        result = result + a;
    }

    void sub(int a) {
        result = result - a;
    }

    void mul(int a) {
        result = result * a;
    }

    void div(int a) {
        result = result / a;
    }

    void display() {
        System.out.println(result);
    }

    void clear() {
        result = 0;
    }
}