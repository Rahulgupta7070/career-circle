package Pattern;

import java.util.Scanner;

public class SquarePrintNumber2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		PrintPattern(n);
	}

	public static void PrintPattern(int n) {
		int start = 1; int nums=1;
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= n; j++) {
				System.out.printf("%4s",nums++);

			}
			System.out.println();
		}

	}
}
