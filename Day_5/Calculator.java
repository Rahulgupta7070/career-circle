package Day_5;

public class Calculator {

    int a, b, c;

	Calculator() {

		System.out.println("Default Constructor");
	}

	Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	Calculator(int a, int b, int c) {

		this(a, b);
		this.c = c;

	}

	@Override
	public String toString() {
		return "Calculator [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
    
}
