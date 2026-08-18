package NumberProgram;

public class SumOfDigits {
	public static void main(String[] args) {
		int nums=12345;
		int sum=0;
		while(nums>0) {
			int digit=nums%10;
			sum=sum+digit;
			nums=nums/10;
		}
	  System.out.println(sum);
	}

}
