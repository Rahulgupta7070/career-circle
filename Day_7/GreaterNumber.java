package Day_7;

import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number...");
		int a = sc.nextInt();

		System.out.println("Enter the seconds Number...");
		int b = sc.nextInt();

		greaterNumber(a, b);
        sc.close(); 
	}

	public static void greaterNumber(int a, int b) {

		String result = (a > b) ? a + " is greater " : b + " is greater ";

		System.out.println(result);
	}
    
}
