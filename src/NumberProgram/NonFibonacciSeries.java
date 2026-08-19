package NumberProgram;

import java.util.Scanner;



public class NonFibonacciSeries {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the Number To generate NonFibonacciSeries ");
	     int n=sc.nextInt();
	   
	     printFibonacci(n);
	     
	}
	  public static void printFibonacci(int n) {
		int a=0; int sum=0; int b=1; 
		  for(int i=1; i<=n; i++) {
			  boolean fibonacci=false;
			while(a<=i) {
			  if(a==i) {
				  fibonacci=true;
				  break;
			  }
			    sum = a+b;
			   a=b;
			   b=sum;
			}  
			if(!fibonacci) {
					  System.out.print(i+" ");
			   
		  }
		  
		  }
	  
	}
}
