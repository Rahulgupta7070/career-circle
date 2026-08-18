 package String;

public class Palindrome {
  public static void main(String[] args) {
	String s = "MADAM";
	System.out.println(isPalindrome(s));
    }
  public static boolean isPalindrome(String s) {
	  int start=0; int end=s.length()-1;
	  while(start<end) {
		  if(s.charAt(start)!=s.charAt(end)) {
			// System.out.println("String is not palindrome");
			 return false;
		  }
		  start++; end--;    
	  }
	  //System.out.println("String is palindrome");
	  return true;
  }
}
