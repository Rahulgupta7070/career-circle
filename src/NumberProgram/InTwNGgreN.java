package NumberProgram;
import java.util.Scanner;

public class InTwNGgreN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int n1 =sc.nextInt();
		int n2 =sc.nextInt();
		int mess=n1>n2 ? n1:n2;
		System.out.println(mess);
		
	}


}
