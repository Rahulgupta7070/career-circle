class Calculator {

    Calculator() {

        System.out.println("Default Constructor");

    }

    Calculator(int a, int b){

        this();

        System.out.println("a = " + a);

        System.out.println("b = " + b);

    }

    Calculator(int a, int b, int c){

        this(a,b);

        System.out.println("c = " + c);

    }

}

public class driver03{

    public static void main(String[] args) {

        Calculator c = new Calculator(10,20,30);

    }

}