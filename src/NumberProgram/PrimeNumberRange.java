package NumberProgram;

import java.util.Scanner;

public class PrimeNumberRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range");
		int range = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= range; i++) {
			if (isPrimeNumber(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\nTotal prime number are: " + count);
	}

	public static boolean isPrimeNumber(int n) {
		if (2 > n) {
			return false;
		} else if (n == 2 && n == 5) {
			return true;
		} else if (n % 2 == 0) {
			return false;
		}
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
