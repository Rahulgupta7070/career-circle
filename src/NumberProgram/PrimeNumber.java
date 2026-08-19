package NumberProgram;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the Number To check Number is Prime or NOT ");
	     int n=sc.nextInt();
		System.out.println(isPrimeNumber(n));
	}
	
	public static boolean isPrimeNumber(int n) {
		if(2>n) {
			return false;
		}
		else if(n==2 && n==5) {
			return true;
		}
		else if(n%2==0) {
			return false;
		}
		for(int i=3; i*i<=n; i+=2) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
