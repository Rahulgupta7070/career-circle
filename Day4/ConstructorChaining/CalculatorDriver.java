package Day4.ConstructorChaining;

public class CalculatorDriver {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator(10, 20);
        Calculator c3 = new Calculator(10, 20, 30);

        c2.printCal();
        c3.printCal();
    }
}