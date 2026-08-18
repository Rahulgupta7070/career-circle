package NumberProgram;

import java.util.Scanner;

public class NumberIsEvenOrOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int n =sc.nextInt();
		if(n%2==0) {
			System.out.println("Number is Even");
		}else {
			System.out.println("Number is Odd");
		}
	}
}
