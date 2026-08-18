package NumberProgram;

public class PalindromeNumber {
    public static void main(String[] args) {
		int nums=121; int rev=0;
		int x = nums;
		while(nums>0) {
			int digit=nums%10;
			rev=digit +rev*10;
			nums=nums/10;
		}
		if(rev==x) {
             System.out.println("Number is Palindrome");
		}else {
			System.out.println("Number is Not Palindrome");
		}
	}
}
