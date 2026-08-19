package Day_7;

import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number..");

		int num = sc.nextInt();

		int result = getFactorial(num);
		System.out.println("The Final Output is: " + result);
        sc.close();

	}

	public static int getFactorial(int num) {

		int fact = 1;
		int i = 1;

		do {
			fact = fact * i;
			i++;
		} while (i <= num);

		return fact;
	}
}
