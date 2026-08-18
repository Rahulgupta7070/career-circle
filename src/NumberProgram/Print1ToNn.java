spackage NumberProgram;

import java.util.Scanner;

public class Print1ToNn {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int n =sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			int res=n-(n-i);
			System.out.println(res);
		}
	
	}
}
