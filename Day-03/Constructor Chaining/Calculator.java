class Calculator {
    int a, b, c;

    Calculator() {
        this(0, 0);
    }
    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    Calculator(int a, int b, int c) {
        this(a, b);
        this.c = c;
    }
    void display() {
        System.out.println("a = " + a + " b = " +b);
        System.out.println("c = " + c);
    }
    public static void main(String[] args) {
        Calculator cal = new Calculator(10, 20, 30);
        cal.display();
    }
}
