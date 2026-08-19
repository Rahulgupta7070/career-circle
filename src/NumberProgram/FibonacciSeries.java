package NumberProgram;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the Number To generate FibonacciSeries ");
	     int n=sc.nextInt();
	     printFibonacci(n);
	}
	  public static void printFibonacci(int n) {
		int a=0; int sum=0; int b=1;
		  for(int i=1; i<=n; i++) {
			  System.out.print(a+" ");
			    sum = a+b;
			   a=b;
			   b=sum;
			   
		  }
	  
	}
}
