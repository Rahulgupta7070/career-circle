package NumberProgram;

import java.util.Scanner;

public class PrintSumOfNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int n =sc.nextInt();
		int sum=0;
		 int i=1;
		 while(i<=n) {
			 sum=sum+i;
			 i++;
		}
		 
		System.out.println("sum is " +sum);
	}
}
