package Day_7;

import java.util.Scanner;

public abstract class EvenOrOdd {
    
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number...");
		int num = sc.nextInt();

		evenOrOdd(num);
        sc.close();
	}

	public static void evenOrOdd(int num) {

		if (num % 2 == 0) {
			System.out.println("This is a Even Number.." + num);
		} else {
		
            System.out.println("This is a Odd Number..." + num);

		}
	}
}
