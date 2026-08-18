package NumberProgram;

public class ReverseNumber {
	public static void main(String[] args) {
	     int nums=12345;
	     String rev="";
	    
	  while(nums>0) {
		  int digit=nums%10;
		  rev=rev+digit;
		  nums=nums/10;
	  }
	  System.out.println(rev);
	}

}
