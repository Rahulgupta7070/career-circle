package Day4.ConstructorChaining;

public class Calculator {
    int a, b, c;

    Calculator() {
    }

    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    Calculator(int a, int b, int c) {
        this(a, b);
        this.c = c;
    }

    void printCal() {
        System.out.println(a + b + c);
    }
}