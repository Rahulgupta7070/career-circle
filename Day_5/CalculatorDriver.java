package Day_5;

import java.util.Scanner;

public class CalculatorDriver {
    
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the A: ");
		int a = sc.nextInt();

		System.out.println("Enter the B: ");
		int b = sc.nextInt();

		System.out.println("Enter the C: ");
		int c = sc.nextInt();

		Calculator calculator = new Calculator(a, b, c);

		System.out.println(calculator);

        sc.close();
	}
}
