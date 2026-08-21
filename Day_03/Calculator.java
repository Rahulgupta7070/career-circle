package Day_03;

public class Calculator {
    int a;
    int b;
    int c;

    Calculator() {
        this(10, 20);
    }

    Calculator(int a, int b) {
        this(a, b, 30);
    }

    Calculator(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void display() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.display();
    }
}
